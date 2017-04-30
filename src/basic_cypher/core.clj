(ns basic-cypher.core
  (:require [basic-cypher.tabula-recta :as tr]
            [clojure.java.io :as io])
  (:gen-class))

;; This function is made redundent by read-file
;; (defn get-name
;;   "Return a string from stdin."
;;   []
;;   (let [name (read-line)]
;;     name))

(defn read-file
  "Return a string from a text file."
  [file]
  (with-open [rdr (io/reader file)]
    (doall (line-seq rdr))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Enter the file to encrypt: "))



