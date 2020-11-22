(ns udemy-clojure-from-beginner-to-advanced.38-file-io)

(slurp "example.txt")

(spit "example.txt" "Hello file IO")

(slurp "example.txt")

(spit "example.txt" "Hello file IO 2")

(slurp "example.txt")

(spit "example.txt" "\nSome new line" :append true)

(slurp "example.txt")

(with-open [w (clojure.java.io/writer "example.txt" :append true)]
  (.write w "\nAnother new line"))

(slurp "example.txt")

(.exists (clojure.java.io/file "example.txt"))

(.delete (clojure.java.io/file "example.txt"))

(.exists (clojure.java.io/file "example.txt"))

