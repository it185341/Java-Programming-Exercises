public class Supervisor extends SalariedEmployee{
    // Constructor that initializes the Manager using the parent constructor
    public Supervisor (String name,int id, String specialty,String address, int children,int year){
        super(name,id,specialty,address,children,year);
    }
    // Salary method to add a 10% bonus to the base salary
    public double salary(){
        double s =0 ;
        s = super.salary()+0.1*super.salary();
        return s;
    }      
}
