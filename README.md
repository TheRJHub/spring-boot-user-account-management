## Spring Boot User Account Management System
A backend application built with Spring Boot to manage user accounts, authentication, and password updates using secure and RESTful APIs.

## Tech Stack
Java, Spring Boot
Spring Security
Hibernate / JPA
MySQL
Maven

## Features
User registration with secure password storage (BCrypt)
Authentication using Spring Security
Change password functionality for authenticated users
RESTful API design with layered architecture
Database persistence using JPA

## API Overview
POST /public/api/createUser – Register a new user
POST /public/api/changepassword – Update user password (secured)
