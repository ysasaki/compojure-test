(defproject heroku-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [ring/ring-jetty-adapter "1.3.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :uberjar-name "heroku-test-standalone.jar"
  :main heroku-test.handler
  :ring {:handler heroku-test.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})