mvn clean package -DskipTests=true

1- copy jar file:
copy ..\target\customerservice-0.0.1-SNAPSHOT.jar .\

2- build docker image
docker build -t customerservice .

3- run the container
docker run -d -p 127.0.0.1:8082:8082 customerservice

4- test
http://127.0.0.1:8082/swagger-ui.html#/