public class SalariedEmployee extends Employee {
    private int children; // Number of children of the employee
    private int year; //Years of work experience
    
    public SalariedEmployee(){} // Default constructor
    //Full constructor
    public SalariedEmployee(String name, int id, String specialty , String address, int  children,int  year){
        super(name,id,specialty,address);
        this.children = children;
        this.year =year;
    }
    //--------Setters & Getters-------------
    public void setChildren(int childrenT){
        this.children = children;
    }
    public int getChildren(){
        return children;
    }
    
    public void setYear(int year){
        this.year= year;
    }
    public int getYear(){
        return year ;
    } 
    /*Method to calculate salary
    Base salary: 700 + 35 per child + 70 for every 3 years of experience*/
    public double salary(){
        double s=0;
        s =700 + children*35 + (year/3)*70;
        return s;
    }
    // Returns string representation including employee info, number of children, years, and salary
    public String toString(){
        return super.toString()+"\nNumber of children: "+children+"\nYears: "+year+"\nsalary: "+salary();
    }
}
