# Transaction Demo

Demo a transaction management system using async, caching to achieve high performance.

## Tech Stack

- Java 21
- Spring Boot 3.x
- Spring Cache
- Jakarta Validation
- Lombok(reduce boilerplate code)
- JUnit 5

## Getting Started

### Prerequisites

- Java 21 or later
- Maven
- Docker (optional)

### Building the Project

```bash
# Build the project
./mvnw clean package

# Run tests
./mvnw test

```

### Running the Application

```bash
# Run with Maven
./mvnw spring-boot:run

# Run the JAR file
java -jar target/transaction-0.0.1-SNAPSHOT.jar
```

### Docker Support

```bash
# Build Docker image
docker build -t transaction-demo:latest .

# Run Docker container
docker run -p 8080:8080 transaction-demo:latest
```

## API Endpoints

- `POST /api/transactions` - Create a new transaction
- `GET /api/transactions/{id}` - Get a transaction by ID
- `PUT /api/transactions/{id}` - Update a transaction
- `DELETE /api/transactions/{id}` - Delete a transaction
- `GET /api/transactions` - List transactions (with pagination)
- 
## Architecture

- In-memory storage using `ConcurrentHashMap`
- Caching with Spring Cache
- Async processing with `CompletableFuture`
- Thread-safe operations
- Input validation using Jakarta Validation

## Testing

The project includes:
- Unit tests
- Edge case tests
- Validation tests
- Concurrency tests



