# Human Resource Management System

`Java-Based HR Management System`

A layered Java application for managing employee and designation records, demonstrating database integration and separation of application responsibilities.

## Project Demonstration

Here is a short preview of the Human Resource Management System project.

https://github.com/user-attachments/assets/cbfa28b6-2cd5-4fee-b631-5ff88e0eecd3

**[Watch the Full Project Demonstration on YouTube](https://youtu.be/goCpFjn7cFg?si=hYMZKOQlXfSxPs7m)**

---

## About

The Human Resource Management System is a Java-based project designed to manage employee and designation information through a layered architecture. It separates business logic, data access, database operations, and presentation responsibilities into distinct layers.

The project demonstrates how the database implementation can be changed from file-based storage to SQL database storage while keeping the higher-level application layers largely unchanged.

## Architecture

The application is organized into the following layers:

- **BL (Business Layer):** Handles business rules and application logic.
- **DL (Data Layer):** Defines data access operations and interfaces.
- **DBDL (Database Data Layer):** Implements database operations using SQL.
- **PL (Presentation Layer):** Provides the user-facing presentation components.

## Features

- Employee record management
- Designation record management
- Employee lookup and validation
- Duplicate PAN and Aadhaar number checks
- Designation-based employee retrieval
- SQL database integration
- Separation of concerns through layered architecture
- Test cases for employee and designation operations

## Technologies Used

- Java
- SQL / MySQL
- JDBC
- Object-Oriented Programming
- Layered Architecture
- Java interfaces and exception handling

## Project Structure

```text
human-resource-management-system/
├── BL/       # Business Layer
├── DL/       # Data Layer
├── DBDL/     # Database Data Layer
├── PL/       # Presentation Layer
└── README.md
```

## Learning Outcomes

This project demonstrates practical implementation of layered architecture, database connectivity, data access interfaces, exception handling, and modular Java application design.

