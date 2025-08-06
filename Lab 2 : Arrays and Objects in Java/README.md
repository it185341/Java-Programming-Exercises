# Lab 2 : Arrays and Objects in Java

This folder contains four Java excercises completes as part of the first university lab session for the Object-Oriented Programming course.

## Excercise 1 - Integer Array Processing 

  Implement a Java program that:
  - Reads an array of `N` integers from the user
  - Includes the following methods:
    - `findMax`: returns the index of the maximum element
    - `findAvg`: returns the average of all elements
    - `display`: prints the array
    - `swap`: swaps two elements by index
 
## Exercise 2 – Array of Employee Objects

  Extend Exercise 3 from Lab1  to include the following:
  - Create an array of `Employee` objects called `staff`
  - `N` (number of employees) is given by user input
  - Implement a static method `displayStaff(Employee[] st)` that prints all employee details, including their final salary

##  Exercise 3 – Array of `Student` Objects
  Create a `Student` array named `lab` in the `TestStudent` class. The user enters the number of students `N` during runtime. Implement the following     methods:
  - `insertStudent`: inserts a student at a given index
  - `displayLab`: prints the student information
  - `passed`: counts students with final grade ≥ 5
  - `avgStudents`: calculates the average final grade
  - `bestStudent`: returns the index of the student with the highest final grade
  
  At the end of the program:
  - Display all student info
  - Show how many passed
  - Show the average grade
  - Show the top student

##  Exercise 4 – `StudentLab` Class with Internal Student Array
  Implement the class `StudentLab` representing a lab class with:
  - An array of `Student` objects
  - An integer pointer to the next available position
  
  Methods to implement:
  - `passed()`: number of students with final grade ≥ 5
  - `avgStudents()`: average final grade
  - `bestStudent()`: index of top student
  
  In `TestStudentLab`:
  - Create a `StudentLab` object with size `N` (entered by user)
  - Insert students
  - Display all student info
  - Show how many passed, the average, and the top student
