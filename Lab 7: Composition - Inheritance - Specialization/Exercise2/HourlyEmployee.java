
public class HourlyEmployee extends Employee{
    private int hours;
    // Constructor to initialize an HourlyEmployee object
    public HourlyEmployee(String name, int id, String specialty, String address, int hours ){
        super(name, id, specialty, address); 
        this.hours = hours;
    }
    //-----------Setters & Getters-----------
    public void setHours(int hours){
        this.hours = hours;
    }
    public int setHours(){
        return hours;
    }
    // Calculate salary based on hours worked, with a 7% bonus
    public double salary(){
         double s=0;
         s = 7*hours; // Base pay: 7 per hour
         s = s+0.07*s ; // Adding 7% bonus
         return s;
    }
    // Return string representation of the HourlyEmployee
    public String toString(){
         return super.toString()+"\nHours: "+hours+"\nsalary: "+salary();
    }
}

