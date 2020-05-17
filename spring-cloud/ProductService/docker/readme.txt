1- copy jar file:
copy ..\target\productservice-0.0.1-SNAPSHOT.jar .\

2- build docker image
docker build -t productservice .

3- run the container
docker run -d -p 127.0.0.1:8081:8081 productservice

4- test
http://127.0.0.1:8081/swagger-ui.html#/