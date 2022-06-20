(defn elementos_pares[lista1 lista2]
  (map second(concat (partition 2 lista1))(partition 2 lista2)))
