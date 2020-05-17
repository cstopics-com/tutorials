## Steps to follow

1. version 1 is serving traffic
1. deploy version 2
1. wait until version 2 is ready
1. switch incoming traffic from version 1 to version 2
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

# switch the traffic to the new version by patching
# the service to send traffic to all pods with label version=v2.0.0
$ kubectl patch service my-app -p '{"spec":{"selector":{"version":"v2.0.0"}}}'

# Test if the second deployment was successful

# In case you need to rollback to the previous version
$ kubectl patch service my-app -p '{"spec":{"selector":{"version":"v1.0.0"}}}'

# If everything is working as expected, you can then delete the v1.0.0

$ kubectl delete deploy my-app-v1
```

### Cleanup

```bash
$ kubectl delete all -l app=my-app
```