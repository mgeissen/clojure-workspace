(ns tutorial.loops)

(defn doLoop
  []
  (println "doLoop")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x))
      ))
  )

(defn doTimes
  []
  (println "doTimes")
  (dotimes [x 10]
    (println x)
    )
  )

(defn doWhileDo
  [count]
  (println "doWhileDo")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)
      ))
  )

(defn doSeq
  [seq]
  (println "doSeq")
  (doseq [x seq]
    (println (inc x)))
  )

(doSeq [1 2 3 4 5])