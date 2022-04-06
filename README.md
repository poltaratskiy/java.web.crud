# java.web.crud
## About

This pet project I created to learn Java, Spring framework, and how to design and implement RESTful API using Spring 
Web, work with database using Spring Data using builtin JPA pattern and to keep db changelog using liquidbase.

There are two related entities:
- **authors** - is parent entity;
- **books** - is child entity related with authors by *author_id* field.

## Get started
This application requires Postgres database. I recommend to use docker image. First of all install Docker if you 
don't have it, see [downloar docker](https://www.docker.com/get-started/). 

After that download image with Postgres:

```sh
docker pull postgres:latest 
```

Run image:

```sh
docker run --name postgresql -e POSTGRES_PASSWORD=yourpassword -d -p 5432:5432 postgres
```

Find container and run CLI. Start psql:
```sh
psql -U postgres
```

Parameter postgres is a default username. Then you have to create database **books**. Type:
```roomsql
CREATE DATABASE books;
```

The last thing is to find application.properties and fill connection parameters to *spring.datasource* section and 
you can run this application.

## Features
1. Create, read, update and delete operations for both of entities - *authors* and *books*;
2. Join related entities and search by fields in both of them;
3. Using JPA to obtain data from database and save;
4. Database changelog using Liquibase;
5. Swagger UI for API visualization. You can change UI path in *application.properties* file. I set */api/docs*
