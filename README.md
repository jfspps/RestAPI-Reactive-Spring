# RestAPI-Spring

This project demonstrates the application of RESTful APIs with Spring, using Spring WebMVC and Spring Webflux.

The [model](./src/main/java/com/jfspps/restapi_spring/api/model) directory replicates the nested structure of the payload (in this case, JSON) as POJOs and then Jackson binds the JSON data sought from Spring's RestTemplate to the parent POJO, [UserData](./src/main/java/com/jfspps/restapi_spring/api/model/UserData.java). This list of users is then available to the app. 