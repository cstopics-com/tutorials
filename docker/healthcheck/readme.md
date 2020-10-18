# Docker Healthcheck

* $ docker build -t docker-health .
* $ docker run --rm --name docker-health -p 8080:80 docker-health
* $ docker ps
```
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS                             PORTS                  NAMES
af2c738b106a        docker-health       "nginx -g 'daemon of…"   52 seconds ago      Up 18 seconds (health: starting)   0.0.0.0:8080->80/tcp   docker-health
```
* $ docker ps
```
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS                    PORTS                  NAMES
af2c738b106a        docker-health       "nginx -g 'daemon of…"   43 seconds ago      Up 40 seconds (healthy)   0.0.0.0:8080->80/tcp   docker-health
```
* $ docker exec docker-health rm -rf /usr/share/nginx/html/system-status.html
* $ docker ps
```
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS                     PORTS                  NAMES
af2c738b106a        docker-health       "nginx -g 'daemon of…"   5 minutes ago       Up 2 minutes (unhealthy)   0.0.0.0:8080->80/tcp   docker-health
```
