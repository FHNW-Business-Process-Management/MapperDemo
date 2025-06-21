# Mapping Application

## Overview
This is a Spring Boot based application that demonstrates the use of MapStruct for object mapping in a Java environment. The application simplifies the process of mapping between different data models, enhancing maintainability and reducing boilerplate code.
The project demonstrates how a mapping problem could be solved in a Java Development Environment in the scope of a Student Assignment at the FHNW based on a real company case.

## Technology Stack
- Java SDK 24
- Spring Boot 3.5.0
- MapStruct 1.6.3
- Gradle as build tool

## Prerequisites
- Java JDK 24
- Gradle

## Building and deploying the Project

```bash
# Clone the repository
git clone <repository-url>
cd <project-directory>

# Only Build the project
./gradlew build

# Directly run the application from source code
./gradlew bootRun
```

## API Documentation
The application exposes RESTful API for mapping operations.

- **Mapping Endpoint**: `localhost:8080/api/map`