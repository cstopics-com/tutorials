# Multi-Stage

* $ docker build --target prod -t mstage:prod .
* $ docker build --target test -t mstage:test .
* $ docker run -p 8050:80 -d mstage:prod
	* access http://localhost:8050/index.html
	* access http://localhost:8050/index-test.html
* $ docker run -p 8060:80 -d mstage:test
	* access http://localhost:8060/index.html
	* access http://localhost:8060/index-test.html
	

