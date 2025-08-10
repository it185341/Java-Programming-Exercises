public class TestMyUtils {
        public static void main(String[] args) {
        int n=7; // Number of students
        Student [] S = new Student[n]; // Array to store Student objects
        // Input first name and last name for each student during object creation
        System.out.println("Insert details for students\n");
        for(int i = 0; i<n;i++){
            System.out.print("First name: ");
            String name = UserInput.getString();
            System.out.print("Last name: ");
            String lastName = UserInput.getString();
            Student s = new Student(name,lastName);
            S[i] = s;
        }
        // Input remaining student data: ID and admission year, using setters
        System.out.println("Enter the remaining details for the students: ");
        for(int i=0; i<n;i++){
            Student s = new Student();
            System.out.println("Student "+i);
            System.out.print("Id: ");
            short id = UserInput.getShort();
            S[i].setId(id);
            System.out.print("Year of admission: ");
            S[i].setYear(UserInput.getShort());
        }
        // Call InsertSortID to sort students array by ID
        System.out.println("========================================");
        MyUtils.InsertSortID(S);
        // Display sorted student data
        System.out.println("Sorted student data: ");
        for(int i =0;i<S.length;i++){
            System.out.println("--------- Student " + i + " -----------------------------");
            System.out.println(S[i]); // Print student details by calling the toString())
        }
    }
}