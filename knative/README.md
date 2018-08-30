# KNative without Riff

You can deploy the same application into Knative without Riff.

### Credentials
Please make sure you have both a push secret and an `imagePullSecret`. This example uses the push secret created for Riff.
* [Creating Google Container Registry push secret for build](https://projectriff.io/docs/getting-started-with-knative-riff-on-gke/#create-a-kubernetes-secret-for-pushing-images-to-gcr)
* [Creating Google Container Registry imagePullSecret](http://docs.heptio.com/content/private-registries/pr-gcr.html)

### Deploy Service
`kubectl apply -f riff-cat-service.yaml`

### Invoke Function
```
export KNATIVE_INGRESS_IP=$(kubectl get services/knative-ingressgateway \
  --namespace=istio-system \
  --output=jsonpath="{.status.loadBalancer.ingress[0].ip}")
curl -H"Host: riff-cat-knative.default.example.com" -XPOST -H"Content-Type: text/plain" -d"Ray" http://${INGRESS_IP}
```
