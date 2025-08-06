public class TestStudent {

  // Compares the final grades of three students and prints them in descending order
    public static void compareTheeStudentMarks(Student S1,Student S2,Student S3){
        double f1 = S1.computeFinal();
        double f2 = S2.computeFinal();
        double f3 = S3.computeFinal();
        if (f1>=f2)
            if(f2>=f3)
            System.out.println("S1 = " +S1.getName()+ " "+ f1+ "\nS2 = "+S2.getName()+" "+f2+"\nS3 = "+S3.getName()+" "+f3);
            else
                if(f1>=f3)
                    System.out.println("S1 = " +S1.getName()+ " "+ f1+ "\nS3= "+S3.getName()+" "+f3+"\nS2 = "+S2.getName()+" "+f2);
                else
                    System.out.println("S3 = " +S3.getName()+ " "+ f3+ "\nS1= "+S1.getName()+" "+f1+"\nS2 = "+S2.getName()+" "+f2);
        else
            if(f1>=f3)
                    System.out.println("S2 = " +S2.getName()+ " "+ f2+ "\nS1= "+S1.getName()+" "+f1+"\nS3 = "+S3.getName()+" "+f3);
            else
                if(f2>=f3)
                    System.out.println("S2 = " +S2.getName()+ " "+ f2+ "\nS3= "+S3.getName()+" "+f3+"\nS1 = "+S1.getName()+" "+f1);
                else 
                    System.out.println("S3 = " +S3.getName()+ " "+ f3+ "\nS2= "+S2.getName()+" "+f2+"\nS1 = "+S1.getName()+" "+f1);
    }       

  // Inserts a Student object into the array at the specified position
    public static void insertStudent(Student [] lab, Student St, int pos){
        if(pos< lab.length){
            lab[pos] = St;
        }
    }

     // Displays the information of all students in the array
    public static void displayLab(Student [] lab){
        for(int i=0;i<lab.length;i++){
            System.out.println((i+1)+" "+lab[i]+"\n");
        }
    }

   // Counts the number of students who have passed (final grade >= 5)
    public static int passed(Student [] lab){
        int count=0;
        for(int i=0;i<lab.length;i++){
            if(lab[i].computeFinal()>= 5)
                count++ ; 
        }
        return count;
    }

   // Calculates the average final grade of all students in the array
    public static double avgStudents(Student [] lab){
        if(lab.length<=0) return -1;
        double sum =0.0;
        for(int i =0;i<lab.length;i++){
            sum = sum + lab[i].computeFinal();
        }
        double avg = sum / lab.length;
        return avg;
    }

   // Finds the index of the student with the highest final grade
    public static int bestStudent(Student [] lab){
        if(lab.length<=0) return -1;
        double max = lab[0].computeFinal();
        int thesiMax=0;
        for(int i=0;i<lab.length;i++){
            if(lab[i].computeFinal() > max){
                max = lab[i].computeFinal();
                thesiMax = i;
            }
        }
        return thesiMax;
    }
    //Main method
    public static void main(String[] args) {
        // Create three Student objects with initial data
        Student S1 = new Student(1234, "Student1", 0 , 7.0, 8.0);
        Student S2 = new Student(2345, "Student2", 0, 8.0, 7.0);
        Student S3 = new Student(4567, "Student3", 0 ,7.0, 7.0);
        
        // Display student information using toString()
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println("===========================");
        compareTheeStudentMarks(S1,S2,S3); // Compare and print the three students by final grade
        System.out.println("===========================");
        System.out.print("Give the number of students: "); // Read the number of students from user input
        int N = UserInput.getInteger();  // Create an array to store students
        Student [] lab = new Student [N];
        // Loop to input student data from the user
        for(int i=0;i<N;i++){
            System.out.println("Insert students information: ");
            System.out.print("Id: ");
            int am = UserInput.getInteger();
            System.out.print("Name: ");
            String onoma  = UserInput.getString();
            System.out.print("Absences: ");
            int apousies= UserInput.getInteger();
            System.out.print("Theory Grade: ");
            double bErg = UserInput.getDouble();
            System.out.print("Lab Grade: ");
            double bTh = UserInput.getDouble();
            lab[i] = new Student (am, onoma, apousies,bErg,bTh);
        }
        System.out.println("===========================");
        //Display messages
        System.out.println("Total number of students is : "+lab.length);  // Display total number of students
        System.out.println("===========================");
        System.out.println("Students information: ");   // Display information of all students
        displayLab(lab);
        System.out.println("===========================");
        System.out.println("Total number of students with final grade >=5 is : "+passed(lab)); // Display count of students with final grade >= 5
        System.out.println("===========================");
        System.out.println("The avarage grade of the students is: "+avgStudents(lab)); // Display average grade of the students
        int i = bestStudent(lab);
        System.out.println("===========================");
        System.out.println("The student with the highest final grade is : "+lab[i]); // Display the student with the highest final grade
    }
}

