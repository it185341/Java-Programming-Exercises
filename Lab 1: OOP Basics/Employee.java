
public class Employee {
    private int id; // Employee ID
    private String fullName; // Full name of the employee
    private int baseSalary; // Base monthly salary
    private double years;  // Number of years working in the company
    private int bonus; // Bonus amount

    public Employee(){} // Default constructor.

    //Constructor with ID and full name only.Useful when the rest of the details are not yet available.
    public Employee(int id, String fullName){
        this(id, fullName, 0 , 0.0 , 0);
    }

    //Full constructor.
    public Employee(int id, String fullName, int baseSalary, double years, int bonus){
        this.id = id;
        this.fullName = fullName;
        this.baseSalary = baseSalary;
        this.years = years;
        this.bonus = bonus;
    }
    //------------------------Setters-------------------------
    public void setId(int id){
        this.id = id;
    }

    public void setfullName(String fullName){
        this.fullName = fullName;
    }

    public void setbaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public void setyears(double years){
        this.years = years;
    }

    public void setbonus(int bonus){
        this.bonus = bonus;
    }
    //------------------------Getters-------------------------
    public int getId(){
        return id;
    }

    public String getfullName(){
        return fullName;
    }

    public int getbaseSalary(){
        return baseSalary;
    }

    public double  getyears(){
        return years;
    }

    public int getbonus(){
        return bonus;
    }
    //Returns a formatted string with employee information.
    public String toString(){
           return("Name: "+fullName+"(Id : "+id+")"+"\nTotal Salary: "+salary()+"€ "+"(Base Salary : "+baseSalary+"€"+" + Bonus: "+bonus+"€)\n");
    }
    //Calculates and returns the total salary.
    public double salary(){
        return baseSalary + (years *10) + bonus;
    }

}
