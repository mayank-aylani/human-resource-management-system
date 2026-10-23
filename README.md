# `Human Resource Management System`

`Java-Based Human Resource Management System`

`A layered Java application for employee and designation management with SQL database integration.`

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Database_Connectivity-4479A1?style=flat)
![SQL](https://img.shields.io/badge/SQL-Database-6C3483?style=flat)

---

## `ABOUT`

`The Human Resource Management System is a Java-based project designed to demonstrate modular software development, layered architecture, and the distribution of development responsibilities within a programming team.`

`The primary objective of this project is to illustrate how a senior or higher-level programmer can design a module, define its interfaces and responsibilities, and distribute the implementation work among junior or lower-level programmers. By following predefined structures and interfaces, developers can create additional modules by reusing existing code, making the necessary modifications, and implementing module-specific logic.`

`The project demonstrates how a well-defined architecture, reusable components, and clear interfaces can simplify development, promote consistency, and allow multiple programmers to work on different modules without needing to understand the complete internal implementation of every layer.`

`The application manages employee and designation records through four layers: Business Layer (BL), Data Layer (DL), Database Data Layer (DBDL), and Presentation Layer (PL). It also demonstrates the separation of business logic from database implementation by transitioning from file-based storage to SQL database storage while keeping the higher-level layers largely unchanged.`

---

## `PROJECT DEMONSTRATION`

`A short preview of the Human Resource Management System project.`

https://github.com/user-attachments/assets/cbfa28b6-2cd5-4fee-b631-5ff88e0eecd3

[![YouTube Demonstration](https://img.shields.io/badge/YouTube-Full_Demonstration-FF0000?style=flat&logo=youtube&logoColor=white)](https://youtu.be/goCpFjn7cFg?si=hYMZKOQlXfSxPs7m)
[![Project Documentation](https://img.shields.io/badge/Google_Drive-Project_Documentation-4285F4?style=flat&logo=googledrive&logoColor=white)](https://drive.google.com/file/d/17aw3mBMUyqxeWiwQrcKB0Uq0Bjf4Mcgz/view?usp=sharing)

---

## `ARCHITECTURE`

`The project follows a layered architecture consisting of the Business Layer (BL), Data Layer (DL), Database Data Layer (DBDL), and Presentation Layer (PL). Each layer has a specific responsibility, allowing the application to remain modular and easier to maintain.`

`Data Layer (DL):` The initial implementation uses file handling to store and manipulate designation and employee records in `designation.data` and `employee.data` files. DAO interfaces define the operations required by the higher layers, while the underlying implementation handles data retrieval, insertion, updating, and deletion.

`Business Layer (BL):` The `DesignationManager` and `EmployeeManager` classes follow the Singleton pattern, providing a shared manager instance for their respective modules. When a manager instance is created, its `getAll()` method calls the corresponding DL DAO method and populates a `Set` with the available records. This keeps the records readily available in memory for faster retrieval and reduces the need to repeatedly fetch all records from the data layer.

`Presentation Layer (PL):` The presentation layer contains the model and user interface components responsible for displaying information and handling user interactions. It communicates with the business layer rather than directly accessing the underlying storage implementation.

`Database Data Layer (DBDL):` The database implementation uses JDBC to connect the Java application to a SQL database and execute database operations. By replacing the file-based DAO implementation with the JDBC-based DBDL implementation and its required dependency, the application can use SQL storage while keeping the higher-level layers largely unchanged.

`This design demonstrates separation of concerns, data access abstraction, in-memory data retrieval, and the ability to change the underlying storage implementation with minimal impact on the business and presentation layers.`

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
|── COMMON/   # Common across Layers (ENUM GENDER)
└── README.md
```

`The structure above is conceptual. Directory names should match the actual repository.`
