# Docker Volume

* $ docker run --name registry -p 5000:5000 -d registry 
* $ docker build -t my-image . 
* $ docker tag my-image localhost:5000/my-repo/my-image 
* $ docker push localhost:5000/my-repo/my-image 
* $ docker run -it localhost:5000/my-repo/my-image /bin/bash

