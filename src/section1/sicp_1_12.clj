(ns
  ^{:author benjaminyu}
  section1.sicp-1-12)

(defn pascal_triangle [x y]
  (cond (= x 0) (if (= y 0) 1 (throw (Exception. "Out of range")))
    (= y 0) 1
    (= y x) 1
    (> x 1) (if (or (< y 0) (> y x)) (throw (Exception. "Out of range"))
              (+ (pascal_triangle (dec x) (dec y))
                (pascal_triangle (dec x) y)))))
