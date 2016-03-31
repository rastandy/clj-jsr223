(defproject clj-jsr223 "0.1.0"
  :description "A JSR 223 implementation written in Clojure."
  :url "https://github.com/rastandy/clj-jsr223"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :aot [clj-jsr223]
  :filespecs [{:type :path :path "META-INF/services/javax.script.ScriptEngineFactory"}])
