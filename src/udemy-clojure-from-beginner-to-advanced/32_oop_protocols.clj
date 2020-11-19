(ns udemy-clojure-from-beginner-to-advanced.32-oop-protocols)

(defstruct point-s :n :x :y)

(struct point-s "A" 10 20)

(def p-s (struct point-s "A" 10 20))

(class p-s)

(:n p-s)

p-s

(deftype PointT [n x y])

(def p-t (PointT. "B" 12 15))

p-t

(class p-t)

(class PointT)

(.n p-t)

(. p-t n)

(defrecord PointR [n x y])

(def p-r (PointR. "C" 15 17))

p-r

(class p-r)

(.y p-t)

(:n p-r)

(.y p-r)

(defprotocol Shape
  (area [this]))

(defrecord Circle [r]
  Shape
  (area [c]
    (* Math/PI (.r c) (.r c))))

(deftype Square [a]
  Shape
  (area [s]
    (* (.a s) (.a s))))

(defn make-bar [w h]
  (reify
    Shape
    (area [_]
      (* w h))))

(def c (Circle. 10))

(def s (Square. 20))

(def b (make-bar 30 40))

(area c)

(area s)

(area b)


