1- copy jar file:
copy ..\target\ContentManagementDocker-0.0.1-SNAPSHOT.jar .\

2- build docker image
docker build -t dockerdemo .

3- run the container
docker run -d -p 127.0.0.1:9090:8080 dockerdemo

4- test
http://127.0.0.1:9090/swagger-ui.html#/