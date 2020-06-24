(ns katas.test.monty-hall
  (:require
    [clojure.test :refer :all]
    [katas.monty-hall.core :as monty-hall]))

(deftest simulate
  (testing "proves that switching doors is optimal"
    (let [{:keys [stay switch]} (monty-hall/simulate)]
      (is (> (stay false) (stay true)))
      (is (> (switch true) (switch false))))))
