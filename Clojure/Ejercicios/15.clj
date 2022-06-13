(defn ultimo [l] (
  if (list? (nth l (dec (count l))))
    (ultimo (nth l (dec (count l))))
    (nth l (dec (count l)))
))

(println (ultimo '((1 2 3) (4 5 6) (7 8 9))))
