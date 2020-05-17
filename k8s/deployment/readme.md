# Steps to follow

## in v1 directory
$ docker build -t hellojs:1.0.0 . 
## in v2 directory
$ docker build -t hellojs:2.0.0 . 

## in main directory
$ kubectl apply -f  nodejs-depl.yaml
$ kubectl apply -f  nodejs-srv.yaml
