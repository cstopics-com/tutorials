# Docker Run

* $ docker run hello-world
* $ docker pull busybox
* $ docker images
* $ docker run busybox
* $ docker run busybox echo "hello from busybox"
* $ docker run alpine ls -l
* $ docker ps
* $ docker ps -a
* $ docker run -it busybox sh
* $ docker rm $(docker ps -a -q -f status=exited)
* $ docker container prune
