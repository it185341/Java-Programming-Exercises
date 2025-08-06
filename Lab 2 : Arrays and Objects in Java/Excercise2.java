 /**
     Displays the details of all employees in the given array.
*/
public static void displayStaff(Employee[] staff){
        System.out.println("================================");
        System.out.println("Employee details: ");
        for(int i=0;i<staff.length;i++){
            System.out.println(staff[i]+"\n"); // Print each employee's info
        }
    }
public static void main(String[] args) {
System.out.println("Insert the number of employees: ");
        int N = UserInput.getInteger(); // Read number of employees from input
        Employee [] staff = new Employee[N]; // Create an array to store employees
        // Input data for each employee
        for(int i=0;i<N;i++){
            System.out.println("Insert the details for employee "+i+" : ");
            System.out.println(" "+i+" : ");
            System.out.print("ID: ");
            int am = UserInput.getInteger();
            System.out.print("Full name: ");
            String onoma = UserInput.getString();
            System.out.print("Salary: ");
            int misthos = UserInput.getInteger();
            System.out.print("Years of service: ");
            double xronia = UserInput.getDouble();
            System.out.print("Bonus: ");
            int bonus = UserInput.getInteger();
            staff[i] = new Employee(id,fullName,baseSalary,years,bonus); // Create a new Employee object with the given data
        }
        displayStaff(staff); // Display all employees
    }
}
