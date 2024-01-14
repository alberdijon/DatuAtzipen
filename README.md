# Game REST API
## Introduction
This project was created as part of the Data Access course in the second year of the Development of Multiplatform Applications program at Uni Eibar. The primary objective was to build a REST API that interacts with a MongoDB database, providing a hands-on experience on integrating a REST API into a web application. Specifically, a JSON dataset was chosen, focusing on Nobel Prizes awarded throughout the last century. The following are the key steps involved in using this project:

Project Background: Developed for the Data Access subject in the second year of the Development of Multiplatform Applications program at Uni Eibar.

-Main Objective: Creation of a REST API for MongoDB interaction, aiming to understand the integration of a REST API in a web application context. 
-Dataset: A JSON dataset was selected, containing information about Nobel Prizes awarded in the last century.  
-Database Interaction: The REST API facilitates interactions with a MongoDB database, allowing for the storage and retrieval of Nobel Prize data.  
-Learning Focus: The project serves as a practical learning experience, emphasizing the role of REST APIs in web applications and providing insights into MongoDB database integration.  
-By following these steps, the project offers a comprehensive learning journey in developing and utilizing a REST API within the context of a web application, using a dataset focused on Nobel Prizes for practical implementation.  

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

## Conclusion
This project provides a comprehensive understanding of building a REST API with Spring Boot, connecting to a MongoDB database, and structuring a Java project. Feel free to explore the Swagger documentation and interact with the API to manage game information.

