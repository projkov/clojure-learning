(ns udemy-clojure-from-beginner-to-advanced.29-dynamic-and-lexical-scope)

(def x 1)

x

(+ x 1)

(let [x 2]
  x)

(defn foo []
  (println x))

(foo)

(let [x 5]
  (println x)
  (foo))

(def ^:dynamic y 1)

y

(+ 1 y)

(let [y 2]
  y)

(defn bar []
  (println y))

(bar)

(binding [y 5]
  (println y)
  (bar))

(let [out-str (java.io.StringWriter.)]
  (binding [*out* out-str]
    (println "Hello!")
    (str out-str)))

