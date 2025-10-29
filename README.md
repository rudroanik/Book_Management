Title: Book Library Management System (REST API)
Problem Overview: 

Build a RESTful API for managing a library's book collection using Spring Boot, JPA, and H2 database. This system will allow librarians to perform CRUD operations on books and implement custom search functionalities.

Task:

Create a Java Spring Boot application that provides RESTful endpoints for managing books in a library system.

Entity Structure(Book):

Id (Long) Primary key, auto-generated

Title

Author 

Publication

publicationYear

availableCopies

Basic: 

1. POST /api/books - Add a new book to the library

2. GET /api/books - Get all books in the library

3. GET /api/books/{id} - Get a specific book by ID

4. PUT /api/books/{id} - Update a specific book's information

5. DELETE /api/books/{id} - Remove a book from the library

6. GET /api/books/author/{authorName} - Find all books by a specific author

7. GET /api/books/genre/{genre} - Find all books in a specific genre

8. GET /api/books/publication/{publication} - Get all books by publication

