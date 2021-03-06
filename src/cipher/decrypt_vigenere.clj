(ns cipher.decrypt-vigenere
  (:require [cipher.helpers :as helper]))

(defn vigenere-decrypt
  [text key-word]
  (let [key-text (cycle key-word) new-text (helper/get-letters text)]
    (apply str (mapv #(helper/decrypt-letter %1 %2) key-text new-text))))