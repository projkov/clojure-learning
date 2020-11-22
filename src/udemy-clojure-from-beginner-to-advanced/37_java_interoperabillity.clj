(ns udemy-clojure-from-beginner-to-advanced.37-java-interoperabillity)

(.toUpperCase "string")

String

(.getName String)

Math/PI

(System/getProperty "java.vm.version")

(macroexpand '(.toUpperCase "string"))

(. "string" toUpperCase)

(. Math PI)

(. (. System getProperties) (get "os.name"))

(.. System getProperties (get "os.name"))

(doto (new java.util.HashMap)
  (.put "a" 1)
  (.put "b" 2))

(new java.util.HashMap)

(java.util.HashMap.)

