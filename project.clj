(defproject functional-webapp-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [me.shenfeng/mustache "1.1"]
                 [compojure "1.1.8"]]

  :resources-path "resources"

  :plugins [[lein-ring "0.8.10"]
            [lein-ancient "0.5.4"]]

  :ring {:handler functional-webapp-example.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
