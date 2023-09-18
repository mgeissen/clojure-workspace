(ns tutorial.functions
  (:gen-class))

(defn -main
  "first function"
  []
  (println "My name is Matti")
  (println "Loving clojure so far")
  (+ 2 5))

#(println "Hello" %1 "how are you" %2)

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  (map increment x))

(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)                                            ; hex number
  (def e nil)
  (def f true)
  (def g "Hello")
  (def h 'thanks)


  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)


  (def status true)
  (def STATUS false)

  (println status)
  (println STATUS)
  )
(DataTypes)