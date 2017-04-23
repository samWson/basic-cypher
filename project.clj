(defproject basic-cypher "0.1.0-SNAPSHOT"
  :description "A simple text cypher program"
  :url "https://github.com/samWson/basic-cypher"
  :license {:name "MIT License"
            :url "https://mitlicense.org/"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot basic-cypher.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
