# Student-Subject Management

## Setup Instructions

### Requirements:
- JDK 19 or higher
- Maven
- H2 Database

### Steps to run:
1. Clone this repository.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run` or use your IDE to run the `SpringBootApplication`.
4. Access the application at `http://localhost:8080`.

### Endpoints:
- **POST /students**: Create a new student.
- **GET /students**: List all students.
- **POST /subjects**: Create a new subject.
- **GET /subjects**: List all subjects.
- **POST /login**: Get JWT token (use in Authorization header as `Bearer <token>` for protected routes).

### Roles:
- `admin` role can access all endpoints.
- `student` role can only access `/subjects` and `/students` endpoints.

