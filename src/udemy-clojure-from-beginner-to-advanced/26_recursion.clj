(ns udemy-clojure-from-beginner-to-advanced.26-recursion)

(defn fact [n]
  (if (== n 1)
    1
    (* n (fact (dec n)))))

(fact 5)

(defn fact [n f]
  (if (== n 1)
    f
    (fact (dec n) (* f n))))

(fact 5 1)

(defn fact
  ([n] (fact n 1))
  ([n f]
   (if (== n 1)
     f
     (fact (dec n) (* f n)))))

(fact 5)

(defn fact-recur
  ([n] (fact-recur n 1))
  ([n f]
   (if (== n 1)
     f
     (recur (dec n) (* f n)))))

(fact-recur 5)
