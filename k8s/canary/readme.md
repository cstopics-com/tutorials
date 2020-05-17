## Steps to follow

1. 10 replicas of version 1 is serving traffic
1. deploy 1 replicas version 2 (meaning ~10% of traffic)
1. wait enought time to confirm that version 2 is stable and not throwing
   unexpected errors
1. scale up version 2 replicas to 10
1. wait until all instances are ready
1. shutdown version 1

## In practice

```bash
# Deploy the first application
$ kubectl apply -f app-v1.yaml

# Test if the deployment was successful
$  kubectl get services
my-app       NodePort    10.107.229.14   <none>        80:30736/TCP   14m
in browser: http://localhost:30736
2018-01-28T00:22:04+01:00 - Host: host-1, Version: v1.0.0

# To see the deployment in action, open a new terminal and run a watch command.
# It will show you a better view on the progress
$ kubectl get po --watch

# Then deploy version 2 of the application
$ kubectl apply -f app-v2.yaml

# Only one pod with the new version should be running.
# You can test if the second deployment was successful

# If you are happy with it, scale up the version 2 to 10 replicas
$ kubectl scale --replicas=10 deploy my-app-v2

# Then, when all pods are running, you can safely delete the old deployment
$ kubectl delete deploy my-app-v1
```

### Cleanup

```bash
$ kubectl delete all -l app=my-app
```