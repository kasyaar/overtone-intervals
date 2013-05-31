(ns tutorial.core
  (:use overtone.live overtone.inst.sampled-piano))

(defn play-interval "doc-string" 
  ([start end]
   (play-interval start end 2))
  ([start end volume]  
  (doseq [n [(note start) (note end)]] (sampled-piano n volume))))


