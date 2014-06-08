(defn square [n] (* n n))

(defn fast_exn_helper [a b n]
  (cond (= n 0) a
    (even? n) (fast_exn_helper a (square b) (/ n 2))
    :else (fast_exn_helper (* a b) b (dec n))))

(defn fast_expn_iter [b n] (fast_exn_helper 1 b n))


(println (fast_expn_iter 2 3))
