(ns udemy-clojure-from-beginner-to-advanced.30-read-eval-apply)

(read-string "[1 2 3]")

(read-string "(def x 5)")

(read-string "(println \"hello\")")

(list '+ 1 2)

(eval (list '+ 1 2))

(+ 1 2)

(eval '(println "hello"))

(+ 1 2 3)

(def lst [1 2 3])

lst

(apply + lst)

(defn our-repl []
  (let [cmd (read-string (read-line))]
    (println cmd)
    (when-not (= 'quit cmd)
      (println ";; =>" (eval cmd))
      (recur))))

(our-repl)
