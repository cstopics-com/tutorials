* $ kubectl version 
* $ kubectl cluster-info
* $ kubectl get nodes

# get information default namespaces
* $ kubectl get pods 
* $ kubectl get all 

# get information all namesapces
* $ kubectl get pods --all-namespaces
* $ kubectl get all --all-namespaces

# Create, scale, rollout, rollout-back and delete the deployments
* $ kubectl create deployment myhttpapp --  image=katacoda/docker-http-server
* $ kubectl get deployments
* $ kubectl get pods -o wide
* $ kubectl describe pod <pod-name>
* $ kubectl get ns
* $ kubectl get pods -n kube-system
* $ kubectl scale deployment myhttpapp --replicas=3
* $ kubectl get deployments
* $ kubectl get pods -o wide
* $ kubectl --record=true set image deployment myhttpapp docker-http-server=katacoda/docker-http-server:v2
* $ kubectl rollout status deployment myhttpapp
* $ kubectl rollout undo deployment myhttpapp
* $ kubectl create ns testns
* $ kubectl create deployment nshttpapp -n testns --image=katacoda/docker-http-server
* $ kubectl get pods -n testns
* $ kubectl delete deployment myhttpapp
* $ kubectl delete deployment nshttpapp -n testns

# logs of a workload
* $ kubectl logs <name>