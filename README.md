# Project-Name

## Description

Material developed in the course ---.  The developed application consists of two microservices, Product and Client. 
The Client microservice is in charge of implementing the business logic necessary to manage users within our application as well as the products they manage. On the other hand, the information of each product managed by a user is located in the Product microservice. 

Each microservice offers a series of endpoints to manage products and users through a REST API and a GraphQL API. 
In addition, the customer microservice communicates with the product microservice to obtain information on the products of each of the users.

## Launch project
### Pre-requisites

You will need two PostgreSQL databases (one per microservice) to launch the application. To easily install and run the required databases you can to the [Database](https://github.com/Chomusuke01/Quarkus-Iniciation-Course/tree/master/Database) folder and run the following command to lauch a container with the required databases: 

```console
$ docker-compose up
```

### Start Project

Within each project you'll find all the information you need to launch the application. You will see that the options to start each application are:

- Run with Java (Java 17 and Maven required)
- Run with Docker (Docker required)
- Native execution (Docker required)
  
### Project testing

To test the project you can access the following URLs 

- Customer Service
    - [REST](http://localhost:8080/q/swaggerui/) 
    - [GraphQL](http://localhost:8080/q/dev-ui/io.quarkus.quarkus-smallrye-graphql/graphql-ui)
- Product Service
  - [REST](http://localhost:8081/q/swaggerui/)
  - [GraphQL](http://localhost:8081/q/dev-ui/io.quarkus.quarkus-smallrye-graphql/graphql-ui)