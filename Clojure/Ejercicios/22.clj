(def m '((1 2 3 4) (5 6 7 8) (9 10 11 12) (13 14 15 16)))

;22. Definir una función para obtener la diagonal principal de una matriz cuadrada que está representada como una lista de listas.

;Algoritmo no recursivo

(defn traza [mat] (map nth mat (range)))

;Algoritmo recursivo

(defn tr_aux [traza mat n_row] (
  if (< n_row 0) traza
  (tr_aux 
    (cons (nth (nth mat n_row) n_row) traza)
    mat
    (dec n_row)
  )                        
))

(defn traza_recursiva [mat] (tr_aux () mat ((comp dec count) mat)))

(println (traza m))
(println (traza_recursiva m))
