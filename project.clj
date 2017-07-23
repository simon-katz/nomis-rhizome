(defproject nomis-rhizome "0.4.0-SNAPSHOT"
  :description "a simple way to visualize graphs"
  :url "https://github.com/simon-katz/nomis-rhizome"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies []
  :global-vars {*warn-on-reflection* true}
  :plugins [[codox "0.6.4"]]
  :codox {:writer codox-md.writer/write-docs}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.7.0"]
                                  [codox-md "0.2.0" :exclusions [org.clojure/clojure]]]}})
