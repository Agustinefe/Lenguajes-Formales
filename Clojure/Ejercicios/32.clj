;32. Definir una función que reciba una cadena y devuelva el acrónimo correspondiente.

(defn first_letter [word] (
   apply str (list (nth word 0) '.)
))

(defn acronimo [frase] (
  apply str (map first_letter (seq (.split frase " ")))
))

(println (acronimo "Mi nombre es Agustin"))
