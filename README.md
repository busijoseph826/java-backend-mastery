# java-backend-mastery
Repository documenting my journey toward becoming a backend, cloud, and production engineer through practical projects and real-world engineering concepts.

# Java Core Practice – Day 1

## Project Overview

This project contains beginner-to-intermediate level Java practice programs created as part of a structured backend engineering learning roadmap.

The main goal of this activity is to strengthen:

* Core Java fundamentals
* Object-Oriented Programming (OOP)
* Memory understanding
* Class and object design
* Problem-solving ability
* Coding consistency

This project focuses on writing clean and understandable Java code while practicing real engineering concepts.

---

# Concepts Covered

## 1. Java Execution Flow

Understanding how Java programs run internally:

```text
.java file
   ↓
Compiler (javac)
   ↓
.bytecode
   ↓
JVM
   ↓
Machine Code
   ↓
Execution
```

Topics learned:

* JDK
* JRE
* JVM
* Bytecode
* Java compilation process

---

# 2. Object-Oriented Programming (OOP)

This project practices the four major pillars of OOP.

## Encapsulation

Protecting data using private variables and public getter/setter methods.

Example:

* Student class
* BankAccount class

---

## Inheritance

Creating parent-child relationships between classes.

Example:

* Animal
* Dog
* Cat

---

## Polymorphism

Method overriding implementation.

Example:

* sound() method in Dog and Cat classes

---

## Abstraction

Understanding how implementation details can be hidden.

Practiced using abstract class concepts.

---

# 3. Java Memory Basics

Learned the difference between:

## Stack Memory

Stores:

* local variables
* method calls
* references

## Heap Memory

Stores:

* objects
* instance variables

Example:

```java
Student s = new Student();
```

* `s` reference → Stack Memory
* `Student object` → Heap Memory

---

# Project Modules

# 1. Student Management Practice

## Features

* Create Student objects
* Store student details
* Display student information
* Find topper student
* Use ArrayList collection

## Concepts Used

* Classes and Objects
* Constructors
* Getter/Setter methods
* ArrayList
* Loops
* Conditional statements

---

# 2. Bank Account System

## Features

* Deposit amount
* Withdraw amount
* Balance checking
* Validation handling

## Concepts Used

* Encapsulation
* Method creation
* Validation logic
* Object state management

---

# 3. Inheritance Practice

## Class Structure

```text
Animal
 ├── Dog
 └── Cat
```

## Features

* Method overriding
* Runtime polymorphism
* Common parent behavior

---

# Java Collections Framework - Day 2

## Overview

This project focuses on understanding and practicing the Java Collections Framework, one of the most important components of Java backend development.

The objective of this activity is to learn how to efficiently store, manage, retrieve, and manipulate data using collection classes such as `ArrayList` and `HashMap`.

These concepts are heavily used in:

* Backend Development
* Spring Boot Applications
* REST APIs
* Microservices
* Caching Systems
* Enterprise Applications

---

# Learning Objectives

By completing this activity, the following concepts were explored:

* Java Collections Framework
* List Interface
* ArrayList
* LinkedList (Conceptual Understanding)
* Map Interface
* HashMap
* Time Complexity Basics
* equals() vs ==
* Real-world Data Management Scenarios

---

# Collections Framework Overview

The Java Collections Framework provides a set of interfaces and classes used to store and manipulate groups of objects dynamically.

```text
Collection
│
├── List
│   ├── ArrayList
│   └── LinkedList
│
├── Set
│   └── HashSet
│
└── Queue

Map
└── HashMap
```

---

# 1. ArrayList

## Description

`ArrayList` is a resizable array implementation that allows dynamic storage of elements.

### Features

* Maintains insertion order
* Allows duplicate values
* Dynamic size
* Fast element access using index
* Widely used in backend applications

### Common Operations

```java
add()
get()
remove()
size()
contains()
```

### Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| Add       | O(1)       |
| Get       | O(1)       |
| Search    | O(n)       |
| Remove    | O(n)       |

---

# 2. LinkedList

## Description

`LinkedList` stores elements as nodes connected through references.

### Features

* Efficient insertion and deletion
* Sequential access
* Higher memory consumption compared to ArrayList

### Comparison

| Feature       | ArrayList | LinkedList |
| ------------- | --------- | ---------- |
| Access        | Fast      | Slow       |
| Insert/Delete | Slower    | Faster     |
| Memory Usage  | Lower     | Higher     |

---

# 3. HashMap

## Description

`HashMap` stores data in key-value pairs and provides fast retrieval using keys.

### Features

* Stores key-value pairs
* Unique keys
* Fast lookup operations
* Allows one null key
* Commonly used in enterprise applications

### Common Operations

```java
put()
get()
remove()
containsKey()
containsValue()
```

### Example

```java
HashMap<Integer, String> employees = new HashMap<>();

employees.put(101, "Joseph");
employees.put(102, "John");

System.out.println(employees.get(101));
```

### Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| Put       | O(1)       |
| Get       | O(1)       |
| Remove    | O(1)       |

---

# 4. equals() vs ==

Understanding the difference between object comparison methods is important when working with collections.

### ==

Compares memory references.

```java
obj1 == obj2
```

### equals()

Compares object content.

```java
obj1.equals(obj2)
```

### Example

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true
```

---

# Practical Exercises

## Exercise 1 - Student List Manager

### Features

* Add Student
* Display Students
* Search Student by ID
* Remove Student

### Concepts Used

* ArrayList
* Classes and Objects
* Loops
* Conditional Statements

---

## Exercise 2 - Employee Directory

### Features

* Add Employee
* Search Employee
* Remove Employee

### Concepts Used

* HashMap
* Key-Value Storage
* Data Retrieval

---

## Exercise 3 - Word Frequency Counter

### Input

```text
apple banana apple mango banana apple
```

### Output

```text
apple = 3
banana = 2
mango = 1
```

### Concepts Used

* HashMap
* Counting Algorithms
* Iteration

---

# Real-World Applications

The concepts learned in this activity are commonly used in:

### ArrayList

* API Response Handling
* Database Result Processing
* User Management Systems
* Order Management Systems

### HashMap

* Caching
* Configuration Management
* Session Management
* Data Lookup Operations
* Microservices Communication

---













