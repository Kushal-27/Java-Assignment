"Read MD File" My Application - Documentation
Technologies Used
Java: The programming language used to develop the application's backend logic.
Spring Boot: The framework used for building the Java-based application with ease.
Spring Data JPA: Used for data access and persistence with the database.
MySQL: The relational database management system used for storing user information.
Spring Security: Employed for securing the application and managing user authentication.
Thymeleaf: The templating engine used for creating dynamic HTML views.
Bootstrap: Used for styling and ensuring a responsive user interface.
Maven: The build tool used to manage dependencies and build the application.
Git: The version control system used for managing the source code.

Prerequisites
Java Development Kit (JDK) version 8 or higher installed on your system.
MySQL server installed and running with the necessary user and database setup.
Apache Maven installed on your system.

Step 1: Clone the Repository
Open a terminal or command prompt on your local machine.
Use the following command to clone the repository:
git clone <https://github.com/Kushal-27/Java-Assignment.git>

Step 2: Configure Database Connection
Open the src/main/resources/application.properties file.
Update the database configuration properties with your MySQL server details:
spring.datasource.url=jdbc:mysql://localhost:3306/tms-dev?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=<your_mysql_username>
spring.datasource.password=<your_mysql_password>

Step 3: Build the Application
Navigate to the project root directory in the terminal or command prompt.
Run the following command to build the application:
mvn clean package

Step 4: Run the Application
After a successful build, run the following command to start the application:

Step 5: Access the Application
Once the application is running, open a web browser.
Go to http://localhost:8080
