public class EmployeeDemo {

    public static void main(String[] args) {
        // Creating HourlyEmployee objects
        HourlyEmployee emp1 = new HourlyEmployee("Papas", 1001, "Engineer", "Dimitriou 1",160);
        HourlyEmployee emp2 = new HourlyEmployee("Georgiou", 1002, "Technician", "Tsimiski 2",150);
        // Creating SalariedEmployee objects
        SalariedEmployee emp3 = new SalariedEmployee("Andreou", 1003, "Cashier", "Olgas 3",2,5);
        SalariedEmployee emp4 = new SalariedEmployee("Basiliou", 1004, "Mechanical Engineer", "Aristotelous 3",3,10);
        // Creating Supervisor objects
        Supervisor emp5 = new Supervisor("Ioannou",1005,"Architect","Nikis 5",2,15);
        Supervisor emp6 = new Supervisor("Dimitriou",1006,"omputer Engineer","Nikis 10",4,6);
        
        // Printing details of each employee
        System.out.println("-------Employee1--------\n  "+emp1);
        System.out.println("-------Employee2--------\n  "+emp2);
        System.out.println("-------Employee3--------\n  "+emp3);
        System.out.println("-------Employee4--------\n  "+emp4);
        System.out.println("-------Employee5--------\n  "+emp5);
        System.out.println("-------Employee6--------\n  "+emp6);
    }   
}
