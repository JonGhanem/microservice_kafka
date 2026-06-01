# Microservice Kafka

This project is a microservices-based application that uses Apache Kafka for communication between services.

## Description

This is a sample project that demonstrates how to build a microservices application with Spring Boot and Kafka. The application consists of the following services:

- **Order Service:** Manages customer orders.
- **Stock Service:** Manages product stock.
- **Email Service:** Sends emails to customers.

The services communicate with each other using Kafka topics.

## Architecture

The application follows a microservices architecture pattern. Each service is a separate Spring Boot application that can be developed, deployed, and scaled independently.

## Technologies Used

- Java
- Spring Boot
- Apache Kafka
- Docker

## Getting Started

### Prerequisites

- Java 17
- Maven
- Docker

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/microservice_kafka.git
   ```
2. Build the services:
   ```bash
   mvn clean install
   ```
3. Run the application using Docker Compose:
   ```bash
   docker-compose up -d
   ```

## Usage

Once the application is running, you can use the following endpoints:

- **Order Service:** `http://localhost:8080`
- **Stock Service:** `http://localhost:8081`
- **Email Service:** `http://localhost:8082`

## Contributing

Contributions are welcome! Please feel free to submit a pull request.

## License

This project is licensed under the MIT License.
