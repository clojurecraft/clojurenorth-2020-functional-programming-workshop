(ns katas.test.mars-rovers
  (:require
    [clojure.test :refer :all]
    [katas.mars-rovers.core :as mars-rovers]))

(deftest go!

  (testing "empty instructions"
    (is (= {:rovers [{:position [0 0 :N]}
                     {:position [3 3 :W]}]}
           (mars-rovers/go!
             {:plateau [5 5]
              :rovers [{:position [0 0 :N]}
                       {:position [3 3 :W]}]}))))

  (testing "no rovers"
    (is (= {:rovers []}
           (mars-rovers/go!
             {:plateau [1 1]
              :rovers []}))))

  (testing "single move"
    (is (= {:rovers [{:position [1 3 :N]}]}
           (mars-rovers/go!
             {:plateau [5 5]
              :rovers [{:position [1 2 :N]
                        :instructions [:M]}]}))))

  (testing "single rotation"
    (is (= {:rovers [{:position [1 2 :W]}]}
           (mars-rovers/go!
             {:plateau [5 5]
              :rovers [{:position [1 2 :N]
                        :instructions [:L]}]}))))

  (testing "multiple commands"
    (is (= {:rovers [{:position [5 1 :E]}]}
           (mars-rovers/go!
             {:plateau [5 5]
              :rovers [{:position [3 3 :E]
                        :instructions [:M :M :R :M :M :R :M :R :R :M]}]}))))

  (testing "won't drive off of plateau"
    (is (= {:rovers [{:position [3 5 :E]}]}
           (mars-rovers/go!
             {:plateau [5 5]
              :rovers [{:position [3 3 :N]
                        :instructions [:M :M :M :M :M :M :M :M :M :M :R]}]})))))
