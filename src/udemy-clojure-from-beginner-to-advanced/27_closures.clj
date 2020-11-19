(ns udemy-clojure-from-beginner-to-advanced.27-closures)

(defn make-inc [x]
  (fn [y] (+ x y)))

(def inc-8 (make-inc 8))

(inc-8 2)

(inc-8 22)

(let [a 5]
  (defn foo [b]
    (* b a)))

(foo 5)
