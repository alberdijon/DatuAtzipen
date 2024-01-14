# Game REST API
## Introduction
Welcome to the Game REST API documentation. This project was developed as part of the Data Access course in the second year of the Development of Multiplatform Applications at Uni Eibar. The primary objective was to create a REST API that interacts with a MongoDB database, gaining insights into how a REST API integrates into a web application. The dataset for this project revolves around gaming, providing information about various games, including their details and reviews.

## Project Structure
### Swagger Access
Swagger UI

### MongoDB Connection Details
Connection String: mongodb://localhost
Database Name: games
Collection Name: game

### Maven Execution Command
mvn spring-boot:run


## Dataset
The dataset for this project focuses on games and their related information. It includes details such as titles, release dates, teams, ratings, genres, summaries, and reviews. The dataset is structured to capture a comprehensive view of the gaming landscape.

## REST Service
The REST service supports various types of requests, aligning with typical CRUD operations: create (POST), read (GET), update (PUT), and delete (DELETE). Endpoints handle different types of requests, making the service versatile. Requests can be made using Swagger UI or other development environments like Insomnia or Postman.

### Overview
Type	Endpoint	Result
GET	/games/jokuguztiak	Returns all games in JSON format
GET	/games/jokoabilatu	Returns the game that matches the given identifier
POST	/games/jokuberria	Adds a new game
PUT	/games/jokuaeguneratu	Updates game information based on the identifier
DELETE	/games/jokuaezabatu	Deletes a game based on the identifier

## MongoDB
This Spring Boot application interacts with a MongoDB database. To create the database, install the MongoDB Community edition and MongoDB Compass. Configure a connection to the local machine using the connection string mongodb://localhost. Create a database named games and a collection named game. Import the dataset, and MongoDB will create documents for each game.

## Java Project
The Java project is a Spring Boot application structured using Maven. The project includes classes for models, controllers, repositories, and a main configuration class. The models represent the structure of the data, and repositories handle data operations. The main controller defines endpoints for the service.

#### Class Diagram
lua
Copy code
  +---------------------+        +------------------+
  |      MainController |        |SpringConfiguration|
  +---------------------+        +------------------+
              |                          |
  +---------------------+        +------------------+
  |        GameRepository|        |  Application     |
  +---------------------+        +------------------+
                           \
                       +------------------+
                       |      MongoDB     |
                       |MongoClient, Codec|
                       +------------------+
## Conclusion
This project provides a comprehensive understanding of building a REST API with Spring Boot, connecting to a MongoDB database, and structuring a Java project. Feel free to explore the Swagger documentation and interact with the API to manage game information.

