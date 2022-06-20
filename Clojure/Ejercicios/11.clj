(defn digs[n] 
  int (flatten(map list(str n)))
)

(println(digs 12345))