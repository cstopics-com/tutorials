 
 # Getting Started
 * $ kubectl create namespace kubernetes-dashboard
 * $ kubectl apply -f kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0/aio/deploy/recommended.yaml
 
 # Create Service Account
 * $ kubectl apply -f dashboard-acount.yaml
 
 # Create ClusterRoleBinding
 * $ kubectl apply -f dashboard-binding.yaml
 
 # Bearer Token
 * $ kubectl -n kubernetes-dashboard describe secret
 
 # Run proxy
 * $ kubectl proxy

# Access Dashboard at:
* http://localhost:8001/api/v1/namespaces/kubernetes-dashboard/services/https:kubernetes-dashboard:/proxy/

