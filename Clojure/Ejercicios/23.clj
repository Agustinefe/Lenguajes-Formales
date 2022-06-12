;23. Definir una función para transponer una lista de listas.

(defn trans [m] (apply map list m))
(println (trans '((1 2 3) (4 5 6))))
