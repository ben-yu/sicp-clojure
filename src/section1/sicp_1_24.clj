
(defn divides? [a b]
  (= (mod b a) 0))

(defn square [x] (* x x))

(defn find-divisor [n test-divisor]
  (cond (> (square test-divisor) n) n
    (divides? test-divisor n) test-divisor
    :else (find-divisor n (+ test-divisor 1))))

(defn smallest-divisor [n]
  (find-divisor n 2))

(defn prime? [n]
  (= n (smallest-divisor n)))

(defn report-prime [n]
  (do (time (prime? n))
    (print n)))

(defn start-prime-test [n]
  (if (prime? n)
    (report-prime n)))

(defn timed-prime-test [n]
  (start-prime-test n))

(defn search-for-primes [start finish]
  (cond (< start finish)
    (do (timed-prime-test start)
      (search-for-primes (+ start 2) finish))))

(search-for-primes 1 100)
(search-for-primes 101 1000)
(search-for-primes 1001 10000)
(search-for-primes 10001 100000)
