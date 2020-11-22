(ns udemy-clojure-from-beginner-to-advanced.35-concurrent-programming)

(def a1 (atom 1))

(deref a1)

@a1

(swap! a1 inc)

(reset! a1 0)

@a1

(def ag1 (agent 0))

(swap! a1 (fn [x]
            (Thread/sleep 3000)
            (inc x)))

(send ag1 (fn [x]
             (Thread/sleep 3000)
             (inc x)))

@ag1

(def acc1 (ref 1000))

(def acc2 (ref 1000))

(dosync
 (alter acc1 - 10)
 (alter acc2 + 10))

@acc1

@acc2

(dosync
 (alter acc1 - 10)
 (/ 1 0)
 (alter acc2 + 10))

@acc1

@acc2

(add-watch acc1 :acc-wathcer
           (fn [k r o n]
             (println k r o n)))

(dosync
 (alter acc1 - 10)
 (alter acc2 + 10))

