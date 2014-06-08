(ns
  ^{:author benjaminyu}
  section1.sicp-1-11)

(defn func_recursiv [n]
  (if (< n 3) n
    (+ (func_recursiv (- n 1))
      (* (func_recursiv (- n 2)) 2)
      (* (func_recursiv (- n 3)) 3))))


(defn func_count [x y z iters]
  (if (= iters 0) (+ x y z)
    (func_count y z (+ x (* y 2) (* z 3)) (- iters 1))))

(defn func_iterative [n]
  (if (< n 3) n
    (func_count 0 1 2 (- n 3))))
