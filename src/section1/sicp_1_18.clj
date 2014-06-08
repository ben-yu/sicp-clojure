(ns sicp)

(defn double [n] (* n 2))
(defn half [n] (/ n 2))

(defn fast-mult-helper [n a b]
  (cond (= b 0) n
    (even? b) (fast-mult-helper n (double a) (half b))
    :else (fast-mult-helper (+ a n) a (+ b -1))))

(defn fast-multi [a b] (fast-mult-helper 0 a b))

(println (fast-multi 4 1000))
