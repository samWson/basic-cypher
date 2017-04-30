(ns basic-cypher.core
  (:require [basic-cypher.tabula-recta :as tr]
            [clojure.java.io :as io])
  (:gen-class))

(defn read-file
  "Return a string from a text file."
  [file]
  (with-open [rdr (io/reader file)]
    (doall (line-seq rdr))))

(defn get-input
  "Prompts for input an returns a string from stdin"
  [message]
  (println message)
  (read-line))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [input (get-input "Enter the file to be encrypted: ")
        key (get-input "Enter the key file: ")]
   (do
     (println (str "Plain: " input))
     (println (str "Key: " key)))))


