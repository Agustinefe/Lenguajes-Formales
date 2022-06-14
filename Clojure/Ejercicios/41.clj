;41. Definir una función que devuelva la lista que resulta al intercalar los elementos de otras dos listas que recibe como parámetros.

(defn trans [m] (apply map list m))

(defn intercalar [a b] (flatten (trans (list a b))))

(println (intercalar '(1 2 3) '(4 5 6)))
