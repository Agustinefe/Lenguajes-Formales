(defn tiene_letras_repetidas? [s] (not ( = (count (vals (frequencies s))) (count s))))

(println (tiene_letras_repetidas? "bikini"))
