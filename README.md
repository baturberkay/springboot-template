# Spring Boot Template

This is a Spring Boot template project that includes basic configurations for a REST API, H2 in-memory database, and Swagger for API documentation.

## Prerequisites

- **Java 21**: This project is developed with Java 21.

## Dependencies

The following dependencies are included in the `pom.xml`:

- **Spring Boot Starter**: Core Spring Boot dependency.
- **Spring Boot Starter Data JPA**: Provides integration with JPA and Hibernate for database operations.
- **Spring Boot Starter Web**: Sets up a web server and includes Spring MVC for building REST APIs.
- **Spring Boot Starter Test**: Includes JUnit, Mockito, and Spring Test for testing.
- **H2 Database**: In-memory database for development and testing.
- **SpringDoc OpenAPI Starter WebMVC UI**: Provides Swagger UI for API documentation.
- **Spring Boot Starter Validation**: Enables Bean Validation (JSR 380) support.

## How to Run

1. Clone the repository.
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the following URLs:
    - **Swagger UI**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
    - **H2 Console**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## Configuration

### Application Properties

Key configurations include:

- **H2 Database**:
    - Name: `springboot_template`
    - Username: `user`
    - Password: `password`
- **H2 Console**:
    - Enabled: `true`
    - Path: `/h2-console`
- **Swagger API Docs Path**: `/api-docs`

### Docker Support

The project includes a `docker-compose.yml` file for containerized deployment. To run the application in Docker:

1. Build the Docker image:
   ```bash
   docker-compose build
   ```
2. Start the container:
   ```bash
   docker-compose up
   ```

## API Endpoints

The application exposes a sample API endpoint:

- **GET** `/api/v1/springboot-template/hello`: Returns a success message.

## License

This project is licensed under the MIT License.
