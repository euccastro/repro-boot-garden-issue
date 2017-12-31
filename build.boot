(set-env!
 :source-paths #{"src/clj" "src/cljs"}
 :resource-paths #{"res"}
 :dependencies '[[org.martinklepsch/boot-garden "1.3.2-1"]
                 [adzerk/boot-reload "0.4.8" :scope "test"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.36"]
                 [garden "1.3.3"]])

(require
 '[org.martinklepsch.boot-garden :refer [garden]]
 '[adzerk.boot-reload    :refer [reload]])

(deftask dev []
  (comp (watch)
     (garden :styles-var 'repro.styles/base
             :pretty-print true
             :output-to "public/css/garden.css")
     (target :dir #{"target"})))
