(defproject michaelradtke/clostache "1.6.0"
  :min-lein-version "2.0.0"
  :description "{{ mustache }} for Clojure"
  :url "https://github.com/michaelradtke/clostache"
  :license {:name "GNU Lesser General Public License 2.1"
            :url "http://www.gnu.org/licenses/lgpl-2.1.txt"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:dependencies [[org.clojure/data.json "0.1.2"]
                                  [jline/jline "0.9.94"]]
                   :resource-paths ["test-resources"]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}}
  :repositories {"clojure-releases" "http://build.clojure.org/releases"}
  :aliases {"all" ["with-profile" "dev:dev,1.9"]}
  :global-vars {*warn-on-reflection* true})
