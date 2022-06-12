(defn sig-mul-10 [n] (
    if (>= n 0)
      (* 10 (inc (quot n 10)))
      (* 10 (quot n 10))  
))

(println (sig-mul-10 -84))
                      
