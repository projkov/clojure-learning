(ns udemy-clojure-from-beginner-to-advanced.20-loops)

(for [i [1 2 3]]
  i)

(for [i [1 2 3]]
  (inc i))

(for [i (range 1 4)]
  (inc i))

(for [i [1 2 3]
      j [3 2 1]]
  [i j])

(for [i (range 10)]
  (let [a (* i i)]
    (/ a 2)))

(for [i (range 10)
      :let [a (* i i)]]
  (/ a 2))

(for [i (range 10)
      :while (even? i)]
  i)

(for [i (range 10)
      :when (even? i)]
  i)

(doseq [i (range 10)]
  (println i))

(dotimes [i 10]
  (println i))



