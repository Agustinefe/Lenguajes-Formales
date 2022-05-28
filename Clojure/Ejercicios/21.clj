(def m '((1 2 3 4) (5 6 7 8) (9 10 11 12) (13 14 15 16)))

;21. Definir una función para obtener la matriz triangular superior (incluyendo la diagonal principal) de una matriz cuadrada que está representada como una lista de listas.

(defn replace_with_zero [n, row] (concat (repeat n 0) (drop n row) ))

(defn triangle_matrix [mat] (map replace_with_zero (range) mat))

(defn tmr_aux [new_mat old_mat n_row] (
  if (< n_row 0) new_mat
  (tmr_aux 
    (cons (replace_with_zero n_row (nth old_mat n_row)) new_mat)
    old_mat
    (dec n_row)
  )
))

(defn triangle_matrix_recursive [mat] (tmr_aux () mat ((comp dec count) mat)))

(println (triangle_matrix m))
(println (triangle_matrix_recursive m))
