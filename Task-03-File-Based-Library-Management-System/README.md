# Task 03 - File-Based Library Management System

## Overview

The File-Based Library Management System is a console-based Java application developed as part of the Java Programming Internship at IncodeVision.

This application allows users to manage library books efficiently using Java File Handling. Book records are stored in a text file, ensuring data persistence even after the program is closed.

## Features

* Add New Books
* View Available Books
* Search Books by ID
* Issue Books
* Return Books
* Store Data in Text Files
* Read and Update Records Using File Handling
* Menu-Driven Interface

## Technologies Used

* Java
* File Handling
* BufferedReader
* BufferedWriter
* Object-Oriented Programming (OOP)
* VS Code

## Project Structure

Task-03-File-Based-Library-Management-System

├── src

│   ├── Book.java

│   ├── LibraryManager.java

│   └── Main.java

├── data

│   └── books.txt

├── screenshots

└── README.md

## Functionalities

### Add Book

Allows users to add new books to the library.

### View Books

Displays all books stored in the library database.

### Search Book

Searches for a book using its unique Book ID.

### Issue Book

Marks a book as issued and updates the file.

### Return Book

Marks a book as returned and updates the file.

## File Handling

The application stores all book information in:

data/books.txt

Book records are maintained in the following format:

BookID,Title,IssuedStatus

Example:

101,Java Programming,false

102,Data Structures,true

## Learning Outcomes

Through this project, I learned:

* Java File Handling
* Reading and Writing Files
* BufferedReader and BufferedWriter
* Data Persistence
* Object-Oriented Programming
* Menu-Driven Application Development

## Internship

Java Programming Internship – IncodeVision

## Author

Chaya Punnam
