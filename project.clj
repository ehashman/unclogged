(defproject unclogged "0.3.0-SNAPSHOT"
  :description "Clojure syslog abstraction"
  :url "https://github.com/RackSec/unclogged"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0-RC5"]
                 [com.cloudbees/syslog-java-client "1.0.8"]
                 [manifold "0.1.2-alpha2"]
                 [com.taoensso/timbre "4.2.0"]]
  :plugins [[lein-cljfmt "0.3.0"]]
  :main ^:skip-aot unclogged.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]])
