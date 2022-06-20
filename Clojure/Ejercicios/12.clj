(defn repartirUno[x](str "Uno para mi, uno para " x ))

(defn repartir
  ([] "Uno para mi uno para vos")
  ([& more] (map repartirUno more))
)

(println(repartir '1 '2 '3))
(println(repartir))