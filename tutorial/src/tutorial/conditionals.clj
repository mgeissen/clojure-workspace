(ns tutorial.conditionals
  (:import (java.util ConcurrentModificationException)))

(defn CondIf
  []
  (println "CondIf")
  (if (= 5 6)
    (println "Equal")
    (println "Not Equal"))
  )

(defn CondIfDo
  []
  (println "CondIfDo")
  (if (= 5 6)
    (do (println "Equal: first statement")
        (println "Equal: second statement"))
    (do (println "Not Equal: first statement")
        (println "Not Equal: second statement"))
    )
  )

(defn CondNestedIf
  []
  (println "ConfNestedIf")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println "true")
    (println "false")))

(defn CondCase
  []
  (println "CondCase")
  (def pet "cat")
  (case pet
    "cat" (println "I have a cat")
    "dog" (println "I have a dog")
    "fish" (println "I have a fish")
    )

  )

(defn CondCond
  [amount]
  (println "CondCond")
  (cond
    (<= amount 2) (println "Amount is smaller or equals than 2")
    (<= amount 50) (println "Amount is smaller than 50")
    (<= amount 100) (println "Amount is smaller than 100")
    :else (println "Amount is higher than 100")
    )
  )

(CondCond 1000)