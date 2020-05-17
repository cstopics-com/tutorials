# Obtaining and running MySQL docker container
* $ docker pull mysql:8.0.1
* $ docker run --name my-own-mysql -e MYSQL_ROOT_PASSWORD=mypass123 -d mysql:8.0.1

# Obtaining and running phpMyAdmin docker container
* $ docker pull phpmyadmin/phpmyadmin:latest
* $ docker run --name my-own-phpmyadmin -d --link my-own-mysql:db -p 8081:80 phpmyadmin/phpmyadmin

# Access phpMyAdmin
* open your favourite browser and type the following url: http://localhost:8081/