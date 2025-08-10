
public class TestMyUtils {

    public static void main(String[] args) {
        int n = 1; // Number of students
        Student [] S = new Student[n]; // Array to store Student objects
        // Input data for each student
        System.out.println("Insert details for students\n");
        for(int i = 0; i<n;i++){
            Student s = new Student();
            System.out.println("Insert student's Id: ");
            s.setId(UserInput.getShort()); //// Read student ID
            System.out.println("Insert student's first name: ");
            s.setName(UserInput.getString()); //// Read student's first name
            System.out.println("Insert student's last name: ");
            s.setLsName(UserInput.getString()); // Read student's last name
            System.out.println("Insert student's admission year: ");
            s.setYear(UserInput.getShort()); // Read student's admission year
            S[i] = s; // Store student object in the array
        }
        // Display all students details
        System.out.println("==================================");
        System.out.println("Student details: ");
        for(int i=0;i<n;i++){
           System.out.println(S[i]);// Calls Student's toString() method
        }
        System.out.println("==================================");
        System.out.println("Insert student's last name: ");
        String lsName = UserInput.getString();
        // Sort students by ID in descending order because Binary search requires ascending order for correct results
        for(int i=0;i<S.length;i++){
            for(int j=0;j<S.length;j++){
                if(S[i].getId() > S[j].getId()){
                    Student temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;
                }
            }
        }
        System.out.println("==================================");
        System.out.println("Dwse to am pou psaxneis: ");  // Prompt for student ID to search
        short id = UserInput.getShort();
        int pos = MyUtils.recursiveSearchByID(S, id, 0, S.length - 1); // Perform recursive binary search
        // Display search result
        if(pos > -1)
            System.out.println(id+" brethike anadromika sti thesi "+pos+" me stoixeia: \n"+S[pos]);
        else 
            System.out.println("O "+id+" den brethike!");

    }
    
}
