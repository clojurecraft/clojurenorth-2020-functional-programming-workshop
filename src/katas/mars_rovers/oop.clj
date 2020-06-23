(ns katas.mars-rovers.oop)

(defrecord Bounds [x y])

(defprotocol IPosition
  (move-pos [_ dir bounds]))
(deftype Position [x y]
  IPosition
  (move-pos [this dir bounds]
    (case dir
      :N (set! (.y this) (min (inc y) (.y bounds)))
      :E (set! (.x this) (min (inc x) (.x bounds)))
      :S (set! (.y this) (max (dec y) 0))
      :W (set! (.x this) (max (dec x) 0)))))

(defprotocol IRover
  (handle [_ command bounds])
  (move [_ bounds])
  (turn [_ dir]))
(deftype Rover [position direction]
  IRover
  (handle [this cmd bounds]
    (if (= cmd :M)
      (move this bounds)
      (turn this cmd)))
  (turn [this dir]
    (set!
      (.direction this)
      (case [direction dir]
        [:N :L] :W
        [:N :R] :E
        [:E :L] :N
        [:E :R] :S
        [:S :L] :E
        [:S :R] :W
        [:W :L] :S
        [:W :R] :N)))
  (move [_ bounds]
    (move-pos position direction bounds)))

(defn go!
  [{:keys [plateau rovers]}]
  (let [bounds (Bounds. (plateau 0) (plateau 1))]
    {:rovers
     (for [rover rovers
           :let [{[x y dir] :position insts :instructions} rover]]
       (let [rover (Rover. (Position. x y) dir)]

         (doseq [cmd insts]
           (handle rover cmd bounds))
         {:position [(.x (.position rover))
                     (.y (.position rover))
                     (.direction rover)]}))}))

(comment

  (def test-pos (Position. 0 0))

  test-pos
  (.x test-pos)

  (def test-rover (Rover. (Position. 0 0) :N))

  (.direction test-rover)
  (.x (.position test-rover))

  (turn test-rover :L)
  (move test-rover (Bounds. 4 5))

  (go!
    {:plateau [5 5]
     :rovers [{:position [1 2 :N]
              :instructions [:M] }]})

  (go!
    {:plateau [5 5]
     :rovers [{:position [0 0 :N]
               :instructions [:M :L :M]}
              {:position [3 3 :W]}]})
  )
