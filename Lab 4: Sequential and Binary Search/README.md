Exercise 1: Linear Search
Implement a Java program to perform a linear search. Define a class Foititis with the following private attributes:

First name (String)

Last name (String)

Student ID (String)

Admission year (short)

Create a class MyUtils containing a method SearchLastName which takes an array of Student objects and a last name (String) as input. The method should return the index of the student in the array whose last name matches the input.

Create a TestMyUtils class with a main method that creates an array of 10 Student objects. Prompt the user to input last names and use the searchByLastName method to search for the student. If found, display the student's details otherwise, print an appropriate message.


Exercise 2: Binary Search
Extend the MyUtils class to include a method searchByStudentID which implements a binary search algorithm. The method should accept a sorted array of Student objects (sorted by student ID) and a student ID (short). It returns the index of the student with the matching ID.

Hints:
Use the getShort() method from UserInput to read the student ID from the keyboard.

Exercise 3: Recursive Binary Search
Add a recursive method recursiveSearchByStudentID in MyUtils that performs a recursive binary search with the same inputs and outputs as above.
