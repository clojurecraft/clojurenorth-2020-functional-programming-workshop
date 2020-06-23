(ns katas.test.bowling
  (:require
    [clojure.test :refer :all]
    [katas.bowling.core :as bowling]))

(deftest total-score
  (testing "always no pins"
    (is (= 0 (bowling/total-score [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0]))))
  (testing "always hitting a single pin"
    (is (= 20 (bowling/total-score [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]))))
  (testing "always hitting pins, but no spares or strikes"
    (is (= 60 (bowling/total-score [1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5]))))
  (testing "spare every round"
    (is (= 150 (bowling/total-score [5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5]))))
  (testing "spare in the first frame"
    (is (= 16 (bowling/total-score [5 5 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0]))))
  (testing "spare in the second frame"
    (is (= 16 (bowling/total-score [0 0 0 10 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0]))))
  (testing "strike"
    (is (= 24 (bowling/total-score [10 3 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0]))))
  (testing "9 pins each round"
    (is (= 90 (bowling/total-score [9 0 9 0 9 0 9 0 9 0 9 0 9 0 9 0 9 0 9 0]))))
  (testing "perfect game"
    (is (= 300 (bowling/total-score [10 10 10 10 10 10 10 10 10 10 10 10]))))
  (testing "strike in the 10th frame"
    (is (= 11 (bowling/total-score [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 10 1 0]))))
  (testing "strike in the 9th frame"
    (is (= 12 (bowling/total-score [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 10 1 0]))))
  (testing "spare in the 10th frame"
    (is (= 11 (bowling/total-score [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 5 1])))))
