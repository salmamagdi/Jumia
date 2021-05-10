# Country Phone App Code 
It is a single page application in Java that shows a customers list categorized by country and phone state (valid or not valid).
## Run 
```
mvn spring-boot:run
```
The home page can be access in http://localhost:8085.

## Swagger Url 
http://localhost:8085/swagger-ui.html#/redirect-controller/expiredTokenUsingGET

## Docker Image 
Create project jar:
```
mvn clean install
```
Build Docker image:
```
docker build -t country-phone .
```
Run Docker image:
```
docker run -d -p 8085:8085 --name country-phone-container country-phone:latest
```
## Technologies
Below the technologies used in this project:
* Java 8 - programming language (current long-term support release version).
* Spring Boot Data JPA - Used to access SQlite data.
* SQlite - Customers database.
* MockMVC - Template tests.
* JUnit5 - Unit tests.
* Lombok - Avoid boilerplate java code.
* MapStruct - Avoid boilerplate copy values code.
* Docker - Create a file for build a project image.
