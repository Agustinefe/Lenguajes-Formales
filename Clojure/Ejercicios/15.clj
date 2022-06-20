(defn eliminarOcurrencias[l d]
  (cond
    (empty? l) l
    (coll? (first l)) 
    (cons (eliminarOcurrencias (first l) d) (eliminarOcurrencias (rest l) d))
    (= d (first l)) (eliminarOcurrencias (rest l) d)
    :else (cons (first l) (eliminarOcurrencias (rest l) d))
  )
)