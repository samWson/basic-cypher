(ns basic-cypher.core
  (:require [basic-cypher.tabula-recta :as tr])
  (:gen-class))

(defn get-name
  "Return a string from stdin."
  []
  (let [name (read-line)]
    name))

(defn -main
  "I don't do a whole lot ... yet."
  [& args])



