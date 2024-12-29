# keycloak-spring-security
This project demonstrates the integration of Spring Boot 3.x, Spring Security 6, and Keycloak to implement a secure authentication and authorization system

## Table of Contents

1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Setup](#setup)
4. [Configuration](#configuration)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)

## Introduction

Spring Boot is a powerful framework for building Java applications with minimal setup, while Spring Security provides robust authentication and authorization mechanisms. Keycloak is an open-source Identity and Access Management solution that adds authentication and authorization to applications.

This project combines these technologies to demonstrate a secure authentication and authorization setup using Spring Boot, Spring Security, and Keycloak.

## Prerequisites

Before getting started, ensure you have the following prerequisites installed:

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- Docker (for running Keycloak)

## Setup

To set up this project, follow these steps:

1. Clone this repository to your local machine.
2. Ensure Docker is installed and running.
3. Navigate to the `keycloak` directory within the project.
4. Run the Keycloak server using Docker Compose:
  ```bash
    docker-compose up -d
  ```
6. Once Keycloak is up and running, proceed to configure it.

## Configuration

Keycloak needs to be configured with the appropriate realm, client, roles, and users. Follow these steps to configure Keycloak:

1. Access the Keycloak administration console by navigating to `http://localhost:8080/auth` in your web browser.
2. Log in with the default administrator credentials (`admin` / `admin`).
3. Create a new realm for your application.
4. Create a client within the realm and configure its settings.
5. Define roles and permissions within the realm.
6. Create users and assign roles to them.
7. Once Keycloak is configured, proceed to configure your Spring Boot application to integrate with it.

## Usage

To use this project:

1. Configure Keycloak as described in the [Configuration](#configuration) section.
2. Configure the Spring Boot application to integrate with Keycloak.
3. Run the Spring Boot application.
4. Access the application in your web browser.
5. You should be redirected to the Keycloak login page to authenticate.
6. After successful authentication, you will be redirected back to the application.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code for both commercial and non-commercial purposes.



