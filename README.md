## Retrieve Weather App

The main goal of this application is fetch weather data from an external server, persist it in our mysql instance and only be shown to users of our app.

The user must have a Rol, that can be "user" or "admin".

Admin rol can see weather details, and users only the cities name.

### Pre requisites

_Docker_ to build up both containers (one for the app and the other for a mysql instance)

## How to run it:
After downloading this repository you must change directory to the docker folder.
```
cd docker
```
In the docker folder now you can build up both containers with:
```
docker-compose up
```
This command will download a maven and a mysql images from docker hub. And excecute "mvn spring-boot: run" after initial setup.

When our maven app finishes its build up, now we have to run mysql commands from the file init.sql to add ours users and rols.

After that, we can access it in our 8080 port. (http:/localhost:8080/)

----------------------
_This Maven project was built with Spring boot, Spring Security, Hibernate, Mysql and Docker._
