# HEROKU API REST


### Setup
--------------------------------------

*. Make sure you have an Eclipse installed (preferably [STS](http://www.springsource.org/sts)).


`Note :` If you don't have Lombok you need to follow up this steps:
   1. Download it from the [project page](http://projectlombok.org/download.html).
   2. Run the JAR (double click or `java -jar �`).
   3. Point it to your Eclipse installation, run the install.
   4. Restart Eclipse.
   
 ### Project description
--------------------------------------

The project uses:
- [Spring Boot](https://spring.io/guides/gs/spring-boot/) - 1.4.1.RELEASE
- [Spring Data REST](https://spring.io/guides/gs/accessing-data-rest/) - 2.5.3.RELEASE
- [Spring Data Mongo](https://spring.io/guides/gs/accessing-mongodb-data-rest/) - 1.9.3.RELEASE
- [Lombok](http://projectlombok.org) to reduce the amount of boilerplate code to be written for Java entities and value objects.

### References
--------------------------------------

- [Accessing Data Rest](https://spring.io/guides/gs/accessing-data-rest/)
- [Spring Data REST](http://projects.spring.io/spring-data-rest/)
- [Spring Data REST Sample](http://examples.javacodegeeks.com/enterprise-java/spring/spring-data-rest-example/)

### Developers
--------------------------------------

- [Ariel Duarte](https://github.com/iarielduarte)

### Running the Application
--------------------------------------

### Running in Heroku

You can test in Heroku [here](https://heroku-api-rest.herokuapp.com)


### Running Local environment

You can run a Spring Boot application from your IDE as a simple Java application, however, first you will need to import your project. Import steps will vary depending on your IDE and build system. Most IDEs can import Maven projects directly, for example Eclipse users can select `Import…​` → `Existing Maven Projects` from the File menu.

So you can run too with spring boot maven with the following command line in the project root directory: 

`mvn spring-boot:run`

and then open a browser and enter the following URL (8080 is the default port for this Tomcat server):

```js
http://localhost:8080/
```

- Hal Browser will show you something like this::

<h1 align="center">
	<br>
	<img width="900" src="https://s17.postimg.org/l2x3n0tsv/halbrenquila.png" alt="awesome">
	<br>
	<br>
	<br>
</h1>


