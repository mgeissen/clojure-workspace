(ns tutorial.animal-age
  (:gen-class))

(def animal_age_factor {'dog 7, 'cat 5, 'fish 10})
(defn animal_age_to_human_age
  "calculate the human age of the given animals age"
  [age animal]
  (def humanAge (* age (get animal_age_factor animal "missing")))
  (println animal "is" humanAge)
  )

(animal_age_to_human_age 10 'dog)
(animal_age_to_human_age 10 'cat)
(animal_age_to_human_age 10 'fish)