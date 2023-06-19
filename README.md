<br />
<div align="center">
<h3 align="center">PRAGMA POWER-UP</h3>
  <p align="center">
    This project develops an application that centralizes the services and orders of a restaurant chain that has different branches in the city..
  </p>
</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
* ![MongoDB](https://img.shields.io/badge/MongoDB-00000F?style=for-the-badge&logo=mongodb&logoColor=white)


### Unit tests are performed with
* [JUnit5](https://junit.org/junit5/) - Library used for testing
* [Mockito](https://site.mockito.org/) - Framework used for code testing
* [Jacoco](https://www.jacoco.org/jacoco/trunk/index.html) - Test coverage tool


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these steps.

### Prerequisites

* JDK 17 [https://jdk.java.net/java-se-ri/17](https://jdk.java.net/java-se-ri/17)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)
* MongoDB [https://www.mongodb.com/](https://www.mongodb.com/)



### Installation

1. Clone the repository
2. Create a new database in MySQL called square
3. Update the database connection settings
   ```yml
   # src/main/resources/application-dev.yml
   spring:
      datasource:
          url: jdbc:mysql://localhost/square
          username: root
          password: <your-password>
   ```
<!-- USAGE -->
## Usage

1. Right-click the class PowerUpApplication and choose Run
2. Open [http://localhost:8091/swagger-ui/index.html](http://localhost:8090/swagger-ui/index.html) in your web browser

<!-- ROADMAP -->
## Tests

- Right-click the test folder and choose Run tests with coverage


## Project structure

### Configuration Layer
It is the outermost layer and is in charge of security configuration, class assignment and dependency injection.

### Layer Adapters
This layer contains two layers: the driven layer and the driving layer.

#### Driving layer
It is the user's entry point when connecting to the application.

It is the most internal module of the architecture, it belongs to 
the domain layer and encapsulates the business logic and rules.


## Entry Points

### Entry point create restaurant
![Image text](img/EntryPointCreateRestaurant.jpg)

### Exit point create restaurant
![Image text](/img/ExitPointCreateRestaurant.jpg)

### Entry point create dish Owner Authentication token
![Image text](img/EntryPointCreateDishAutenticationOwner.jpg)

### Exit point create dish
![Image text](/img/ExitPointCreateDish.jpg)

### Entry point update dish Owner Authentication token
![Image text](img/EntryPointUpdateDish.jpg)

### Exit point update dish
![Image text](/img/ExitPointUpdateDish.jpg)

### Entry point enable/disable dish
![Image text](img/EntryPointEnableDisableDish.jpg)

### Exit point enable/disable dish
![Image text](/img/ExitPointEnableDisableDish.jpg)

### Entry point List Restaurants
![Image text](img/EntryPointListRestaurants.jpg)

### Exit point List Restaurants
![Image text](/img/ExitPointListRestaurants.jpg)

### Entry point Add Employee To Restaurant
![Image text](img/EntryPointAddEmployeeToRestaurant.jpg)

### Exit point Add Employee To Restaurant
![Image text](/img/ExitPointAddEmployeeToRestaurant.jpg)

### Entry point List Dishes
![Image text](img/EntryPointListDishes.jpg)

### Exit point List Dishes
![Image text](/img/ExitPointListDishes.jpg)

### Entry point Create Order
![Image text](img/EntryPointCreateOrder.jpg)

### Exit point Create Order
![Image text](/img/ExitPointCreateOrder.jpg)

### Entry point Create OrderDish
![Image text](img/EntryPointCreateOrderDish.jpg)

### Exit point Create OrderDish
![Image text](/img/ExitPointCreateOrderDish.jpg)

### Entry point List Orders
![Image text](img/EntryPointListOrders.jpg)

### Exit point List Orders
![Image text](/img/ExitPointListOrders.jpg)

### Entry point Assign an Order
![Image text](img/EntryAssignOrder.jpg)

### Exit point Assign an Order
![Image text](/img/ExitPointAssignOrder.jpg)

### Entry point Order Ready
![Image text](img/EntryPointOrderReady.jpg)

### Exit point Order Ready
![Image text](/img/ExitPointOrderReady.jpg)

### Entry point Order Delivered
![Image text](img/EntryPointOrderDelivered.jpg)

### Exit point Order Delivered
![Image text](/img/ExitPointOrderDelivered.jpg)

### Entry point Order Canceled
![Image text](img/EntryPointOrderCanceled.jpg)

### Exit point Order Delivered
![Image text](/img/ExitPointOrderCanceled.jpg)


## Author ✒️
* **Valentina Santa Muñoz** 

