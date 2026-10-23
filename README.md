# Human Resource Management System

`Java-Based Human Resource Management System`

`A layered Java application for employee and designation management with SQL database integration.`

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Database_Connectivity-4479A1?style=flat)
![SQL](https://img.shields.io/badge/SQL-Database-6C3483?style=flat)

---

## `ABOUT`

`The Human Resource Management System is a Java-based application designed to manage employee and designation records using a layered architecture.`

`The application separates business logic, data access, database operations, and presentation responsibilities into independent layers.`

`The project demonstrates a transition from file-based storage to SQL database storage by changing the database implementation and its required dependency while keeping the higher-level application layers largely unchanged.`

---

## `PROJECT DEMONSTRATION`

`A short preview of the Human Resource Management System project.`

https://github.com/user-attachments/assets/cbfa28b6-2cd5-4fee-b631-5ff88e0eecd3

[**Watch the Full Project Demonstration on YouTube**](https://youtu.be/goCpFjn7cFg?si=hYMZKOQlXfSxPs7m)

[**View Project Documentation (PDF)**](https://drive.google.com/file/d/17aw3mBMUyqxeWiwQrcKB0Uq0Bjf4Mcgz/view?usp=sharing)

---

## `ARCHITECTURE`

**`BL — Business Layer`**

- `Handles business rules and application logic.`

**`DL — Data Layer`**

- `Defines data access interfaces and operations.`

**`DBDL — Database Data Layer`**

- `Implements database operations using SQL.`

**`PL — Presentation Layer`**

- `Contains presentation components and user interaction. Designation presentation functionality has been demonstrated; the employee presentation layer is not yet implemented.`

---

## `FEATURES`

- `Employee record management and lookup by employee ID.`
- `Designation record management and lookup by code and title.`
- `Employee lookup by PAN number and Aadhaar card number.`
- `Duplicate employee ID validation.`
- `Duplicate PAN number and Aadhaar card number validation.`
- `Retrieval of employees based on designation code.`
- `SQL database integration.`
- `Test cases for employee and designation operations.`

---

## `TECHNOLOGIES USED`

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-4479A1?style=flat)
![SQL](https://img.shields.io/badge/SQL-6C3483?style=flat)

- `Java — Application development and object-oriented programming.`
- `Gradle — Build and dependency management.`
- `JDBC — Connectivity between Java applications and databases.`
- `MySQL / SQL — Relational database storage and query execution.`

---

## `PROJECT STRUCTURE`

```text
human-resource-management-system/
├── BL/       # Business Layer
├── DL/       # Data Layer
├── DBDL/     # Database Data Layer
├── PL/       # Presentation Layer
└── README.md
```

`The structure above is conceptual. Directory names should match the actual repository.`

---

## `TESTING`

- `Designation test cases for data-layer operations and validation.`
- `Employee test cases for data-layer operations and validation.`
- `Validation of duplicate employee identifiers, PAN numbers, and Aadhaar numbers.`

---

## `KEY CONCEPTS`

- `Layered software architecture and separation of concerns.`
- `Java interfaces and data access abstraction.`
- `Exception handling and modular application design.`
- `Database connectivity and SQL-based persistence.`
- `Separation of business logic from database implementation.`

---

## `LEARNING OUTCOMES`

`Practical experience in designing layered Java applications and separating business logic from data access.`

`Understanding database integration, Java interfaces, validation, exception handling, and modular software development.`

