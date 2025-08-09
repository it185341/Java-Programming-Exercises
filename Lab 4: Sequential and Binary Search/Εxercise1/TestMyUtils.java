public class TestMyUtils {
        public static void main(String[] args) {
        int n = 1;
        Student [] S = new Student[n];
        for(int i=0;i<S.length;i++){
            Student s = new Student();
            System.out.println("\nInsert details for student " + (i+1));
            System.out.print("Insert student's first name: ");
            s.setName(UserInput.getString());
            System.out.print("Insert student's last name: ");
            s.setLsName(UserInput.getString());
            System.out.print("\nInsert student's Id: ");
            s.setId(UserInput.getString());
            System.out.print("\nInsert student's admission year:  ");
            s.setYear(UserInput.getShort());
            S[i] =s;
        }
        System.out.println("==================================");
        System.out.println("Student details: ");
        for(int i=0;i<n;i++){
           System.out.println(S[i]); 
        }
        System.out.println("==================================");
        System.out.println("Insert student's last name: ");
        String lsName = UserInput.getString();
        int pos = MyUtils.SearchLastName(S,lsName);
        if(pos > -1)
             System.out.println("==============="+lsName+" was found at position "+pos+"\n================"+"\nStudent's details is:\n "+S[pos]);
        else 
            System.out.println(lsName+" not found!");

    }
}

