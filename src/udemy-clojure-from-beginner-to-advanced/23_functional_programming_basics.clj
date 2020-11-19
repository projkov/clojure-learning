(ns udemy-clojure-from-beginner-to-advanced.23-functional-programming-basics)

(defn foo [x y] (+ x y))

(def bar (fn [x y] (+ x y)))

foo

bar

(foo 5 3)

(bar 5 3)

(fn [x] (+ 5 x))

#(+ 5 %)

(let [boo (fn [x] (+ x 10))]
  (boo 5))

(defn make-inc []
  (fn [x] (+ x 1)))

(def my-inc (make-inc))

(my-inc 5)

(defn make-inc [x]
  (fn [y] (+ y x)))

(def inc-5 (make-inc 5))

(inc-5 5)

(def inc-10 (make-inc 10))

(inc-10 5)

(defn my-apply-two [f1 f2 arg]
  (f1 (f2 arg)))

(my-apply-two inc inc 0)

(my-apply-two inc #(* 5 %) 5)

(defn my-comp [f1 f2]
  (fn [arg] (f1 (f2 arg))))

(my-comp inc #(* 5 %))

((my-comp inc #(* 5 %)) 5)

(def sdfa (my-comp inc #(* 5 %)))

(sdfa 5)

(sdfa 15)

(map inc [1 2 3])

(map #(* 5 %) [1 2 3])

(filter odd? (range 10))

(filter even? (range 10))

(remove odd? (range 10))

(remove even? (range 10))

(reduce + 10 (range 10))

(reduce + 100 (range 10))



