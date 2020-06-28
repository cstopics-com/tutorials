
This command pulls ActiveMQ docker image together with management plugin installed and enabled by default.
docker pull rmohr/activemq

Next, we can run ActiveMQ:
docker run -d -p 61616:61616 -p 8161:8161 rmohr/activemq

http://localhost:8161/admin/
admin/admin