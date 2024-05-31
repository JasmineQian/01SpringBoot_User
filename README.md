# SpringBoot_userCRUD_withBearerToken
UserCRUD requests based on SpringBoot + Hibernate with Bearer Token based authentication



## How to install mysql and start mysql service?

    docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=my-secret-pw -p 3306:3306 -d mysql
    
    docker run --name mysql-user-server -e MYSQL_ROOT_PASSWORD=12345 -p 3306:3306 -d mysql:8.4.0
    docker run --name test -e MYSQL_ROOT_PASSWORD=12345 -d mysql:8.4.0
    curl --header "Content-Type: application/json" --request POST http://localhost:8080/token?username=user&password=12345

## 
    docker exec -it mysql-server mysql -uroot -p
    
    CREATE DATABASE bear;
    
    create table user (
    `id` varchar(200) not null,
    `first_name` varchar(200),
    `last_name` varchar(200),
    `email_address` varchar(200),
    `password` varchar(200),
    `account_created` varchar(200),
    `account_updated` varchar(200)
    );
    
    insert into user(id, first_name,last_name,email_address,password)
    values(1,'11','22','user@test.com','$2b$12$HY5QCv3lngW45Icbbx4/gOxq4sY2QpDAwBqNKg.8prRCDt6yOKKNW');

    EXIT;


mvn spring-boot:run