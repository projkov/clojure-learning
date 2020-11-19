(ns udemy-clojure-from-beginner-to-advanced.18-control-structures)

(if true 1 -1)

(if false 1 -1)

(if (even? 2) "even" "odd")

(if (even? 3) "even" "odd")

(defn my-abs [x]
  (if (> x 0)
    x
    (- x)))

(my-abs 10)

(my-abs -10)

(when true 1)

(when false 1)

(when-not false -1)

(when-not true -1)

(defn safe-div [a b]
  (when-not (= b 0)
    (/ a b)))

(safe-div 10 5)

(safe-div 10 0)

(case 10
  10 :ten
  20 :twenty)

(case 20
  10 :ten
  20 :twenty)

(case 30
  10 :ten
  20 :twenty)

(case 30
  10 :ten
  20 :twenty
  :default-number)

(defn greet [lang]
  (case lang
    :russian "Privet"
    :english "Hello"
    :spanish "Hola!"
    "Hello!"))

(greet :russian)

(greet :english)

(greet :spanish)

(greet :other)

(defn greet2 [lang]
  (get {:russian "Privet"
        :english "Hello"
        :spanish "Hola!"} lang
       "Hello!"))

(greet2 :russian)

(greet2 :other)

(cond true 1)

(cond false 1)

(cond false 1 true 2)

(cond false 1 false 2)

(defn grade [percentage]
  (cond
    (> percentage 70) :A
    (> percentage 60) :B
    (> percentage 50) :C
    (> percentage 40) :D
    true :F))

(grade 10)

(grade 74)

(grade 61)
 

