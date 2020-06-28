
This command pulls RabbitMQ docker image together with management plugin installed and enabled by default.
docker pull rabbitmq:3.8-management

Next, we can run RabbitMQ:
docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3.8-management

http://localhost:15672/
guest/guest

