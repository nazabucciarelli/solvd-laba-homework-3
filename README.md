# 3rd Homework of Java Test Automation Course - Solvd Laba
This repository stores the 3rd homework given by our mentor in the Java Test 
Automation Course at Solvd Laba. It consists in a modification of the last 
homework (2nd), applying polymorphism concepts, protected access modifier and
overriding Object methods as toString(), hashCode() and equals().

## Explanation

To accomplish the requirements of the homework, I've changed the attributes
from class Person to protected, so they are accessible only from Employee
and Customer classes. I've applied polymorphism adding Customers and
Employees in a Person array and adding the walk() abstract method in Person
in order to make that child classes override it. Finally, I've overridden 
toString(), hashCode() and equals() methods in each non-abstract class.

## Technologies

- Java

## Set-Up

To run this project you will need an updated version of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and, finally, run the Main.java 
file to see the program output.

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)
