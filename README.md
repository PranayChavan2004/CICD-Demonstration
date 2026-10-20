## A simple Spring Boot application built to learn and practice **CI/CD** (Continuous Integration and Continuous Delivery), including building the project with Maven and running it in a Docker container.

## CI/CD Pipeline

The pipeline stages planned for this project:

1. **Checkout**: pull the source code from the repository
2. **Build and Test**: `mvn clean package`
3. **Docker Build**: `docker build -t cicd-example-app .`
4. **Push Image**: push the image to a registry (e.g. Docker Hub)
5. **Deploy**: run the container on a server
