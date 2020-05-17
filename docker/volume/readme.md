# Docker Volume

* $ docker build -t vol-mount-image . 
* $ docker run --name vol-mount -it -d vol-mount-image
* $ docker run -it --volumes-from vol-mount debian /bin/bash

