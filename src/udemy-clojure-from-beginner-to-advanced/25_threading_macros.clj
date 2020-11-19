(ns udemy-clojure-from-beginner-to-advanced.25-threading-macros)

(-> 5
    inc
    (* 2)
    dec)

(->> 5
     dec
     (/ 8)
     inc)

(->> (range 10)
     (filter odd?)
     (map inc)
     (reduce +))


