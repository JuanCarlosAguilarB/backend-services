### Project REST API for User and Transaction Management

This project consists of the development of a REST API for user and transaction management, implemented in an environment using a hexagonal architecture with Spring Boot. The main functionalities that have been implemented are detailed below:

1. **User Registration:**
   - Allows users to register by providing the necessary information.

2. **User Login:**
   - Allows users to authenticate themselves to access protected functionalities of the system.

3. **Nearby Restaurants Query:**
   - Provides an endpoint for logged-in users to receive a list of restaurants near a city or specific coordinates, using a public API to obtain this data.

4. **Historical Transaction Query:**
   - Allows to query the list of transactions made historically by authenticated users.

5. **User Logout:**
   - Allows users to logout in a secure way.

### Project Structure

This repository is organized using a hexagonal architecture under the `hexagonal-architecture` project in the root. Inside this folder, you will find a specific README file (`README.md`) that provides detailed instructions on how to run and use the project. Be sure to review that file for specific information about configurations, dependencies and running the project in your local environment.

### Running the Project

To run this project locally, it is recommended to use Docker with Docker Compose, as requested. Make sure you have Docker and Docker Compose installed on your machine before proceeding.

### Running Instructions

To begin, navigate to the `hexagonal-architecture` folder and follow the instructions detailed in the `README.md` file to set up and run the project.
