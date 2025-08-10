public class TestMyUtils {
    public static void main(String[] args) {
         int n = 1; // Number of students
        Student [] S = new Student[n]; // Array to store Student objects
        // Input data for each student
        System.out.println("Insert details for students\n");
        for(int i = 0; i<n;i++){
            Student s = new Student();
            System.out.println("Insert student's Id: "); 
            s.setId(UserInput.getShort()); // Read short value for student ID
            System.out.println("Insert student's first name: ");
            s.setName(UserInput.getString()); // Read String value for first name
            System.out.println("Insert student's last name: ");
            s.setLsName(UserInput.getString()); // Read String value for last name
            System.out.println("Insert student's admission year: ");
            s.setYear(UserInput.getShort()); // Read short value for admission year
            S[i] = s; // Store student object in the array
        }
        System.out.println("==================================");
        System.out.println("Student details: ");
        for(int i=0;i<n;i++){
           System.out.println(S[i]);  // Calls Student's toString() method
        }
        for(int i=0;i<S.length;i++){
            for(int j=0;j<S.length;j++){
                if(S[i].getId() > S[j].getId()){
                    Student temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;
                }
            }
        }
        // Ask for an ID to search
        System.out.println("==================================");
        System.out.println("Insert student's id: ");  
        short id = UserInput.getShort();
        int pos = MyUtils.searchID(S, id);
        // Display result
        if (pos >=0 )
            System.out.println("Id: "+id+"found on possition: "+pos+"with :\n"+S[pos]);
        else 
            System.out.println("Id "+id+"NOT FOUND!");
    }
    
}
