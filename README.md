# User REST API (PostgreSQL Integration)

This project is a simple RESTful API built with Spring Boot and PostgreSQL.  
It demonstrates backend integration with a relational database using UUID as a primary key and database schema management via migrations.

---

## 🚀 Tech Stack

- Java  
- Spring Boot  
- Hibernate / JPA  
- PostgreSQL  
- Gradle  
- Flyway (database migrations)

---

## 🗄 Database

**Database:** PostgreSQL  
**Table:** `users`  
**Primary Key:** UUID  

### Example table structure

| Column   | Type    |
|----------|---------|
| id       | UUID    |
| username | VARCHAR |
| password | VARCHAR |
| age      | INTEGER |

Database schema is managed using migrations.

---

## 🔄 API Endpoints

### ➕ Create User  
**POST** `/{student}/Postgres`

Example request body:

```json
{
  "username": "oleksandr",
  "password": "4325354",
  "age": 18
}
```
---
## 📖 Get All Users

**GET** `/{student}/Postgres`

Returns all users stored in the database.

▶ Running the Application

Configure PostgreSQL connection in application.yml

Make sure the database is running

Start the application:
```
./gradlew bootRun
```
Server runs on:
```
http://localhost:9090
```
---
## 🎯 Purpose

This project was created to practice:

- REST API development

- PostgreSQL integration

- Database migrations

- Layered architecture (Controller → Service → Repository)

- Working with UUID as a primary key
