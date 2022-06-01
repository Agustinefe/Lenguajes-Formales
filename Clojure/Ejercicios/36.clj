;36. Definir la función sublist que devuelva la sublista correspondiente a una lista, una posición inicial y una longitud dadas. Por ejemplo: (sublist '(A B C D E F G) 3 2) → (C D)

(defn sublist [lis i len] (take len (drop (dec i) lis)))

(println (sublist '(A B C D E F G) 3 2))

;DADA UNA LISTA DE LISTAS, DEVOLVER LA CANTIDAD DE VERDADEROS EN CADA FILA.

(defn true_count [row] (count (filter true? row)))

(defn trues [mat] (map true_count mat))

(def m '( (true false false) (false false false) (true true false) (true false true)))

(println (reduce + (trues m)))
