(ns udemy-clojure-from-beginner-to-advanced.24-destructuring)

(let [[a b] (range 10)]
  (println "a: " a)
  (println "b: " b))

(let [[a b & rst] (range 10)]
  (println "a: " a)
  (println "b: " b)
  (println "rst: " rst))

(let [[a b & rst :as entr] (range 10)]
  (println "a: " a)
  (println "b: " b)
  (println "rst: " rst)
  (println "entr: " entr))

(def m {:a 1 :b 2 :c 4 :d 3})

m

(let [{a :a var-c :c} m]
  (println "a: " a)
  (println "c: " var-c))

(let [{:keys [a c]} m]
  (println "a: " a)
  (println "c: " c))

(let [{:keys [a c] :as entr-map} m]
  (println "a: " a)
  (println "c: " c)
  (println "entr-map: " entr-map))

(let [{:keys [a c e] :as entr-map} m]
  (println "a: " a)
  (println "c: " c)
  (println "e: " e)
  (println "entr-map: " entr-map))

(let [{:keys [a c e] :as entr-map :or {e "Default e"}} m]
  (println "a: " a)
  (println "c: " c)
  (println "e: " e)
  (println "entr-map: " entr-map))

(defn foo [x & args]
  (println "x: " x)
  (println "args: " args))

(foo 1)

(foo 1 2 3)

(defn foo [x & [y z & args]]
  (println "x:" x)
  (println "y:" y)
  (println "z:" z)
  (println "args:" args))

(foo 1)

(foo 1 2)

(foo 1 2 3)

(foo 1 2 3 4)

(foo 1 2 3 4 5)


(defn foo [x & {:keys [y z]}]
  (println "x:" x)
  (println "y:" y)
  (println "z:" z))

(foo 1)

(foo 1 :y 2)

(foo 1 :y 2 :z 3)

(defn foo [{:keys [a b] :or {b 42}} x y]
  (println "x:" x)
  (println "y:" y)
  (println "a:" a)
  (println "b:" b))

(foo {:a 1 :b 2} 3 4)

(foo {:a 1} 3 4)

(defn foo [{:keys [a b] :or {b 42} :as opts} x y]
  (println "x:" x)
  (println "y:" y)
  (println "a:" a)
  (println "b:" b)
  (println "opts: " opts))

(foo {:a 1 :c 100 :g 110} 1 2)


