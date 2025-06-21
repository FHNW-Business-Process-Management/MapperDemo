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

# Build the project and execute the build
./gradlew build

java -jar build/libs/MapperDemo-0.0.1-SNAPSHOT.jar

# If the mentioned build can not be found, run the following command to identify the build
ls build/libs/

# Directly run the application from source code
./gradlew bootRun
```

## API Documentation
The application exposes RESTful API for mapping operations.

- **Mapping Endpoint**: `localhost:8080/api/map`
### Example Request Body
```json
{
"versicherungsNr": "12345678901",
"nachname": "Müller",
"vorname": "Anna",
"geburtsdatum": "1990-01-05",
"versicherungstyp": "KVG",
"rechnungsdatum": "2025-02-13",
"drgCode": "F06B",
"rechnungstyp": "DRG",
"mcdLink": "https://sumex.ch/...",
"ticketId": "TCK-2025-98765"
}
```