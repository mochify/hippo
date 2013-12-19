;; lein file for hippo

(defproject com.mochify/hippo "0.1.0-SNAPSHOT"
 :description "Hippo secret sauce of mochify"
 :url "http://mochify.github.io/hippo/"
 :license {
    :name "Apache License, version 2.0"
    :url "http://www.apache.org/licenses/LICENSE-2.0"
    :distribution :manual
    :comments "For now"
    }

 :dependencies [[org.clojure/clojure "1.5.1"]
                [compojure "1.1.6"]
                [ring "1.2.1"]
                [enlive "1.1.5"]]
 ;;:pedantic? :abort
 :plugins [[lein-ring "0.8.8"]]
 :main ^:skip-aot hippo.core
 :target-path "target/%s"
 :profiles {:uberjar {:aot :all}}
 :repositories [["java.net" "http://download.java.net/maven/2"]])