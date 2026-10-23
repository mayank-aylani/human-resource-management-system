# Human Resource Management System

`Java-Based Human Resource Management System`

`A layered Java application for employee and designation management with SQL database integration.`

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Database_Connectivity-4479A1?style=flat)
![SQL](https://img.shields.io/badge/SQL-Database-6C3483?style=flat)

---

## About

The Human Resource Management System is a Java-based project designed to manage employee and designation records. It follows a layered architecture that separates business logic, data access, database operations, and presentation responsibilities.

The project demonstrates the transition from file-based storage to SQL database storage by changing the database implementation and its required dependency while keeping the higher-level application layers largely unchanged.

---

## Project Demonstration

`Short Project Preview`

https://github.com/user-attachments/assets/cbfa28b6-2cd5-4fee-b631-5ff88e0eecd3

[**Watch the Full Project Demonstration on YouTube**](https://youtu.be/goCpFjn7cFg?si=hYMZKOQlXfSxPs7m)

[**View Project Documentation (PDF)**](https://drive.google.com/file/d/17aw3mBMUyqxeWiwQrcKB0Uq0Bjf4Mcgz/view?usp=sharing)

---

## Architecture

`BL — Business Layer`

Handles business rules and application logic.

`DL — Data Layer`

Defines data access interfaces and operations.

`DBDL — Database Data Layer`

Implements database operations using SQL.

`PL — Presentation Layer`

Contains presentation components and user interaction. Designation presentation functionality has been demonstrated; the employee presentation layer is not yet implemented.

---

## Features

`Employee Management` · `Designation Management`

`Employee Lookup by ID` · `PAN/Aadhaar Validation`

`Designation Lookup by Code and Title`

`Designation-Based Employee Retrieval`

`Duplicate Employee ID Checks`

`SQL Database Integration`

`Employee and Designation Test Cases`

---

## Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-4479A1?style=flat)
![SQL](https://img.shields.io/badge/SQL-6C3483?style=flat)

- `Java` — Application development and object-oriented programming.
- `Gradle` — Build and dependency management.
- `JDBC` — Java database connectivity.
- `MySQL / SQL` — Relational database storage and operations.

---

## Project Structure

```text
human-resource-management-system/
├── BL/       # Business Layer
├── DL/       # Data Layer
├── DBDL/     # Database Data Layer
├── PL/       # Presentation Layer
└── README.md
```

The directory names above represent the conceptual project structure. Adjust them if the actual repository uses different names.

---

## Testing

Employee and designation test cases are used to verify data-layer operations and validation rules, including duplicate employee identifiers and PAN/Aadhaar numbers.

---

## Learning Outcomes

`Layered Architecture` · `Separation of Concerns`

`Java Interfaces` · `Data Access Abstraction`

`Exception Handling` · `Database Connectivity`

`Modular Application Design`

