# Lab 1 – Introduction to Object-Oriented Programming

This lab introduces the basic principles of Object-Oriented Programming (OOP) using Java. It includes class creation, constructors, getters/setters, method overriding, and object comparison.

## 1. Class: `Student`

  ### Description
  A class representing a student, with the following fields:
  - Registration number
  - First name
  - Last name
  - Number of absences
  - Lab grade
  - Theory grade
  
  ### Methods
  - Constructor
  - Getters and Setters
  - `toString()`
  - `computeFinal()`: Calculates the final grade as:  
    **Final Grade = 30% * Lab Grade + 70% * Theory Grade**
  
  ### Class: `TestStudent`
  - Contains the `main()` method
  - Creates two `Student` objects
  - Displays their details and final grades

## 2. Extension: Compare Students

  ### Method: `compareThreeStudentMarks(Student s1, Student s2, Student s3)`
  - Accepts 3 student objects
  - Compares their final grades
  - Prints a numbered list (descending order) with their names and final grades

## 3. Class: `Employee`

### Description
A class representing a company employee with:
- Registration number
- First name
- Last name
- Base salary
- Years of service
- Bonus

### Methods
- Constructor
- Getters and Setters
- `toString()`
- `salary()`: Calculates final salary as:  
  **Final Salary = Base Salary + (Years of Service × 10) + Bonus**

### Class: `TestEmployee`
- Contains the `main()` method
- Creates two `Employee` objects
- Displays their details and final salaries

## 4. Extension: Low Salary Check

### Method: `FindLowSalary(Employee e1, Employee e2)`
- Checks if an employee:
  - Has a base salary < 1200€
  - Has years of service ≥ 5
- If both conditions are met:
  - Prints a message: “This employee is underpaid”
  - Increases base salary by 100€
 
*User input for object creation is handled using a separate `UserInput` class.*
