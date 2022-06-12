(defn map_nucleotido [nu] (
  case nu
    \G \C
    \C \G
    \T \A
    \A \U
    "Error"
))

(defn adn2arn [adn] (
  map map_nucleotido adn
))

(println (adn2arn "ACGT"))
