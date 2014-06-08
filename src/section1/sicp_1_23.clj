
(defn nextdiv [n]
  (cond (= n 2) 3
    :else (+ n 2)))

(defn divides? [a b]
  (= (mod b a) 0))

(defn slow-find-divisor [n test-divisor]
  (cond (> (square test-divisor) n) n
    (divides? test-divisor n) test-divisor
    :else (slow-find-divisor n (+ test-divisor 1))))

(defn find-divisor [n test-divisor]
  (cond (> (square test-divisor) n) n
    (divides? test-divisor n) test-divisor
    :else (find-divisor n (nextdiv test-divisor))))

(defn smallest-divisor [n]
  (find-divisor n 2))

(time (slow-find-divisor 28409 2))
(time (smallest-divisor 28409))