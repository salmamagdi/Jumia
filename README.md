# Country Phone App Code 
It is a single page application in Java that shows a customers list categorized by country and phone state (valid or not valid).
* [Build Spring Boot App ](https://github.com/salmamagdi/Jumia/tree/main)
* [Build  Angular 8 App with Bootstrap](https://github.com/salmamagdi/Jumia/tree/main-ui)

**Prerequisites:** 
* [Node 10](https://nodejs.org/)+
* [Java 8](https://adoptopenjdk.net/)+

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/salmamagdi/Jumia.git
```

This will get a copy of the project installed locally. To install all of its dependencies and start each app, follow the instructions below.
### Spring Boot Configuration
```
mvn spring-boot:run
```

### Angular Configuration

```bash
npm install && npm start
```
Open your browser to http://localhost:4200/countryPhone, log to the App.


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
