(ns udemy-clojure-from-beginner-to-advanced.31-macros)

(defmacro my-when [cond-expr & body]
  `(if ~cond-expr
     (do ~@body)))

(my-when (> 5 3)
         (println "yes")
         (println "!")
         10)

(my-when (> 3 5)
         (println "yes")
         (println "!")
         10)

(when (> 5 3)
  (println "yes")
  (println "!")
  10)

(macroexpand `(my-when (> 3 5)
                       (println "yes")
                       (println "!")
                       10))

(macroexpand `(when (> 3 5)
                       (println "yes")
                       (println "!")
                       10))

`(1 2 3)

`(1 2 (4 5))

'(1 2 (4 5))

`(1 2 (+ 4 5))

`(1 2 ~(+ 4 5))

(def lst [4 5 6])

lst

`(1 2 ~lst)

`(1 2 ~@lst)
