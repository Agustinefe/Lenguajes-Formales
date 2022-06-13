(defn centro [l] (
  if (list? (nth l (quot (count l) 2)))
    (centro (nth l (quot (count l) 2)))
    (nth l (quot (count l) 2))
))
