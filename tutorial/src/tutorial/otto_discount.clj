(ns tutorial.otto-discount
  (:gen-class))

(defn calculate-otto-discount
  "calculate the 15% otto discount for a given price"
  [price]
  (def discountPrice (* (/ price 100) 85))
  (println "You will pay" discountPrice "€")
  )

