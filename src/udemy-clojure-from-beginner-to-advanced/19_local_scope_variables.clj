(ns udemy-clojure-from-beginner-to-advanced.19-local-scope-variables)

(let [a 5]
  (inc a))

(let [a 5
      b 19]
  (+ a b))

(let [a 5
      b 10]
  (println "a=" a)
  (println "b=" b)
  (+ a b))

(let [a 5
      b 10
      sum (+ a b)]
  (/ sum 2))

(let [a 5
      _ (println "a=" a)
      b 10
      _ (println "b=" b)
      sum (+ a b)
      _ (println "sum=" sum)]
  (/ sum 2))

(def x 5)

x

(+ 5 x)

(let [x 10]
  (+ 5 x))

x

(+ x 5)
