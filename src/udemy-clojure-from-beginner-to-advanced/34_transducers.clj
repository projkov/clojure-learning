(ns udemy-clojure-from-beginner-to-advanced.34-transducers)

(map inc (range 10))

(map inc)

(take 5 (range 10))

(take 5)

(def x (comp (map inc) (take 5) (filter odd?)))

x

(eduction x (range 10))

(transduce x + (range 50))

