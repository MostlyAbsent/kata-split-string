(ns kata-split-string.kata-split-string)

(defn solution [s]
  (->> (if (odd? (.length s))
         (str s "_")
         s)
       (re-seq #"..")))
