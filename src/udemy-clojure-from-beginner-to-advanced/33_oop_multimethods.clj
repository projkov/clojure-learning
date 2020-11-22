(ns udemy-clojure-from-beginner-to-advanced.33-oop-multimethods)

(defmulti area (fn [shape] (:type shape)))

(defmethod area :circle [c]
  (* Math/PI (:r c) (:r c)))

(defmethod area :square [s]
  (* (:a s) (:a s)))

(area {:type :circle :r 10})

(area {:type :square :a 20})

(defrecord Circle [r])

(defrecord Square [a])

(defmulti str-shape (fn [shape fmt]
                      [(class shape) fmt]))

(defmethod str-shape [Circle :short] [c _]
  (str "C:" (.r c)))

(def c (Circle. 10))

c

(str-shape c :short)

(defmethod str-shape [Circle :detailed] [c _]
  (str "Circle with radius " (.r c)))

(str-shape c :detailed)

(defmethod str-shape [Square :detailed] [s _]
  (str "Square with side " (.a s)))

(defmethod str-shape [Square :short] [s _]
  (str "S: " (.a s)))

(def s (Square. 20))

(str-shape s :short)

(str-shape s :detailed)

(str-shape c :short)

(str-shape c :detailed)
