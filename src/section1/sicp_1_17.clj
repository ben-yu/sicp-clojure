(defn double [n] (* n 2))

(defn half [n] (/ n 2))

(defn fast-mult [a b]
  (cond (= b 1) a
    (even? b) (fast-mult (double a) (half b))
    :else (+ (fast-mult a (+ b -1) ) a)))

(println (fast-mult 1000 1000))