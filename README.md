<<<<<<< HEAD
**Taxi-Service**

=======
#Taxi-Service
>>>>>>> 6b900ab (First commit)
### Project description:
```
A simple web application that supports authentication, registration and other CRUD operations. 
This application was made for educational and demonstration purposes.
```
## Features:
- registration;
- authentication;
- creat/update/remove a driver;
- creat/update/remove a manufacturer;
- creat/update/remove a car;
- display list of all drivers;
- display list of all manufacturers;
- display list of all cars;
- display list of all cars by current driver;
- add driver to car.
## Project structure (3-layer architecture):
- DAO - Data access layer
- Service - Application logic layer
- Controllers - Presentation layer
## Technologies:
- Java 11
- Git
- Apache Maven
- Apache Tomcat
- Apache Log4j 2
- MySQL
- JDBC
- Javax Servlet
- JSP
- JSTL
- HTML/CSS
- Checkstyle plugin
## How to run a project:
- Download and install MySQL;
- Download and install Apache TomCat(**IMPORTANT**! You must use version: 9.0.x);
- Clone this repository;
- Configure Apache Tomcat in your IDEA;
- Copy and run SQL script [/src/main/resources/init_db.sql](/src/main/resources/init_db.sql) to creating a schema and tables for the project;
- Configure [/src/main/java/taxi/util/ConnectionUtil.java](/src/main/java/taxi/util/ConnectionUtil.java) by replacement of all plugs such as: URL, USERNAME, PASSWORD, JDBC_DRIVER;
- Configure [/src/main/resources/log4j2.xml](/src/main/resources/log4j2.xml) replace "ABSOLUTE_PATH" with the path to your log file.
- Run project.
