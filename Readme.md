# Global Hope Consortium Website

Global Hope Consortium is a multi-service platform offering Software Development, Accounting Consultancy, Transport Services, and Electronics Resell. This project is being developed using modern technologies, with an emphasis on custom code over plugins to master web development.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies and Tools](#technologies-and-tools)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Development Workflow](#development-workflow)
- [Features and Roadmap](#features-and-roadmap)
  
## Project Overview
The platform will have the following service categories:
- **Software Development**: Showcase of software services and consulting.
- **Accounting Consultancy**: Features related to bookkeeping, VAT, and tax compliance.
- **Transport Services**: Includes long-distance trips, airport transfers, and rental options.
- **Electronics Resell**: Buying and renting vintage and modern electronics.

## Technologies and Tools
The project uses the following stack:
- **Frontend**: HTML5, CSS3 (SCSS), JavaScript (Vanilla)
- **Backend**: Java (Spring Boot with Gradle)
- **Database**: PostgreSQL
- **Hosting**: Docker (Development), WordPress (Initial hosting but will transition as features evolve)
- **Version Control**: Git
- **Other Tools**: 
  - Docker: Containerization for development environments.
  - Gradle: Build automation tool for managing dependencies in Spring Boot.
  - Node.js: For any JavaScript or related build processes.

## Project Structure

```plaintext
Global-Hope-Consortium/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   ├── resources/
│   │   │   ├── ...
│   ├── build.gradle
│   ├── settings.gradle
│   └── Dockerfile
│
├── frontend/
│   ├── public/
│   │   ├── images/
│   │   └── styles/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   ├── package.json
│   └── Dockerfile
│
├── database/
│   ├── init.sql
│   └── Dockerfile
│
├── README.md
└── docker-compose.yml