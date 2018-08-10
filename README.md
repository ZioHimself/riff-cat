# Riff Cat

A demo Spring Cloud Function that builds into a Riff container using Jib.

### Build Container
`./mvnw compile jib:build`

### Test Locally
`docker pull saturnism/riff-cat && docker run -ti --rm -p 8080:8080 saturnism/riff-cat`

### Deploy Function
`riff service create hello --image=saturnism/riff-cat`

### Invoke Function
`riff service nvoke hello -- -H"Content-Type: text/plain" -d "Ray"`
