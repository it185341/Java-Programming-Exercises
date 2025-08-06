public class TestEmployee {
    public static void FindLowSalary(Employee E1, Employee E2){
        double e1 = E1.salary();
        double e2 = E2.salary();
        if(e1<1200 && E1.getyears() >= 5){
            System.out.println("Employee "+E1.getfullName()+" is low-paid");
            E1.setbaseSalary(E1.getbaseSalary() + 100);
            System.out.println("Updated information: \n" + E1);
            System.out.println("============================================================");
        }
        if(e2<1200 && E2.getyears() >= 5){
            System.out.println("Employee "+E2.getfullName()+" is low-paid");
            E1.setbaseSalary(E2.getbaseSalary() + 100);
            System.out.println("Updated information: \n" + E2);
            System.out.println("=============================================================");
        }
    }
    public static void main(String[] args) {
        Employee E1= new Employee (12345, "Employee1", 900 , 5.0 , 100);
        Employee E2= new Employee (23456, "Employee2", 1300 , 2.5 , 50);
        System.out.println(E1);
        System.out.println();
        System.out.println(E2);
        System.out.println();
        System.out.println("=============================================================");
        FindLowSalary(E1,E2);
    }
}
