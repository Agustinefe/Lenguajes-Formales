(defn nth_fibo [n] (if (< n 2) n (+ (nth_fibo (dec n)) (nth_fibo (dec (dec n))))))

(println (nth_fibo 4))
