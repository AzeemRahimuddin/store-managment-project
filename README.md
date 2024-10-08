
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram


![UML Diagram](https://github.com/user-attachments/assets/ac7b5df9-9363-4b81-b277-3507de16f8a6)

## Description

In this project, I created an electronic store, in which users can view the prices and inventory of specific devices such as phones and laptops. I chose this topic because I like technology and found that this would work best for a project. In my project, I created a superclass which was the electronic items then which connected to the subclasses which were phones and laptops. In each of these subclasses, I included many no arguement/ parameterized constructors to help initialize the items that were being used in my program. I also included the toString method to return information from each subclass back to the superclass, which then can help when printing out descriptions of the electronic items. I used if-statements to display the electronic's details based on user selection and also used them to check if the user input is valid or not.  I have used the scanner object in my project and ask the user for basic input such as numbers to select which type of electronic device they would like to view. Once they select the type of device, it prints out the specifications of the selected option and how many there are in stock. 





