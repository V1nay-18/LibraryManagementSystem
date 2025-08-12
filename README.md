# LibraryManagementSystem
Java-based CRUD app using Hibernate &amp; PostgreSQL
# 📚 Book Management System (Library Core)

## Overview
This Java-based console application serves as the foundational data layer of a Library Management System. It enables users to perform Create, Read, Update, and Delete (CRUD) operations on book records using Hibernate ORM and PostgreSQL. Designed with modular architecture, the system is scalable and ready for extension into full library functionality such as member tracking and loan management.

## Features
- Add new books with title and author
- View book details by ID
- Update book author information
- Delete books from the catalog
- Interactive console interface
- Hibernate ORM integration for seamless object–relational mapping
- PostgreSQL backend for persistent data storage

## Technologies Used
- Java
- Hibernate ORM
- PostgreSQL
- JDBC
- JPA Annotations

## How to Run Locally

### 1. Setup PostgreSQL
- Install PostgreSQL and ensure it's running
- Create a database:
  ```sql
  CREATE DATABASE hibernate_library_db;
