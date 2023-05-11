(ns isfine.isfine
  (:require [babashka.http-server :as http]))

(http/serve {:port 1341 :dir "resources/public"})

;;@(promise)