(ns repro.styles
  (:require [garden.def :refer [defrule defstyles]]
            [garden.stylesheet :refer [rule]]))

(def base
  [[:div#test
    {:background-color :red}]])
