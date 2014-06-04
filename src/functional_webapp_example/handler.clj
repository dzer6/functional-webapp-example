(ns functional-webapp-example.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [me.shenfeng.mustache :as mustache]
            [compojure.route :as route]))

(mustache/gen-tmpls-from-resources "templates" [".tpl"]
  (fn [data]
    (assoc data :default-title "Example App")))

(defn home [request]
  (let [session (:session request)]
    (prn session)
    {:body (home-page {:time (System/currentTimeMillis)})
     :session (assoc session :hi (System/currentTimeMillis))}))

;(home-page {:time (System/currentTimeMillis)})

(defn get [request]
  (-> request :session :hi str))

(defroutes app-routes
  (GET "/" [] "Hello World")

  (GET "/home" request home)

  (GET "/get" request get)

  (route/resources "/")

  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
