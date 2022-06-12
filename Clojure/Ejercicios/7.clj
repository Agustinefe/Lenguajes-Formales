(defn ten_raised_to [n] (reduce * (repeat n 10)))
(defn char2int [c] (- (int c) 48))
(defn intarray2int [ia] (reduce + (map * (reverse ia) (map ten_raised_to (range)))))
(defn str2int [s] (intarray2int (map char2int s)))
(defn reverse_int [n] (str2int (reverse (str n))))

(println (reverse_int "293713"))
