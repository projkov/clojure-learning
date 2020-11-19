(ns udemy-clojure-from-beginner-to-advanced.21-exception-handling)

(/ 1 0)

(throw (Exception. "Test Exception"))

(try
  (throw (Exception. "Test exception"))
  (catch Exception e (println "Handled exception:" e)))

(try
  (/ 1 0)
  (catch Exception e (println "Handled exception:" e)))

(try
  (/ 1 0)
  (catch Exception _ (println "Handled exception")))

(try
  (/ 1 0)
  (catch ArithmeticException _ (println "Handled ArithmeticException")))

(try
  (/ 1 0)
  (catch ArithmeticException _
    :infinity))

(try
  (throw (Exception. "General Exception"))
  (catch ArithmeticException _
    (println "Handled ArithmeticException")
    :infinity))

(try
  (throw (Exception. "General Exception"))
  (catch ArithmeticException _
    (println "Handled ArithmeticException")
    :infinity)
  (catch Exception _
    (println "Handled GeneralException")
    :nil))

(try
  (/ 1 0)
  (catch ArithmeticException _
    (println "Handled ArithmeticException")
    :infinity)
  (catch Exception _
    (println "Handled GeneralException")
    :nil))

(try
  (/ 1 0)
  (catch ArithmeticException _
    (println "Handled ArithmeticException")
    :infinity)
  (catch Exception _
    (println "Handked GeneralException")
    :nil)
  (finally (println "Finally code")))


(try
  (/ 10 5)
  (catch ArithmeticException _
    (println "Handled ArithmeticException")
    :infinity)
  (catch Exception _
    (println "Handked GeneralException")
    :nil)
  (finally (println "Finally code")))
