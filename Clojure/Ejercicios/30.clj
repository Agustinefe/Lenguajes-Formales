;30. Definir la función slice que reciba una cadena cad y un número n y devuelva una lista con todas las subcadenas contiguas de cad cuyo tamaño sea n. Por ejemplo: (slice "abcde" 3) → ("abc" "bcd" "cde")

(defn join [cad] (apply str cad))

(defn slice [cad n] (map join (partition n 1 cad)))

(println (slice "Hello World!" 3))

;DADA UNA LISTA DE LISTAS, DEVOLVER LA CANTIDAD DE VERDADEROS EN CADA FILA.

(defn true_count [row] (count (filter true? row)))

(defn trues [mat] (map true_count mat))

(def m '( (true false false) (false false false) (true true false) (true false true)))

(println (reduce + (trues m)))
