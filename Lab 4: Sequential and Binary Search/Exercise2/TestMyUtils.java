public class TestMyUtils {
    public static void main(String[] args) {
         int n = 1;
        Student [] S = new Student[n];
        // Input data for each student
        System.out.println("Insert details for students\n");
        for(int i = 0; i<n;i++){
            Student s = new Student();
            System.out.println("Insert student's Id: ");
            s.setId(UserInput.getShort());
            System.out.println("Insert student's first name: ");
            s.setName(UserInput.getString());
            System.out.println("Insert student's last name: ");
            s.setLsName(UserInput.getString());
            System.out.println("Insert student's admission year: ");
            s.setYear(UserInput.getShort());
            S[i] = s;
        }
        System.out.println("==================================");
        System.out.println("Student details: ");
        for(int i=0;i<n;i++){
           System.out.println(S[i]); 
        }
        System.out.println("==================================");
        System.out.println("Insert student's last name: ");
        String lsName = UserInput.getString();
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
        System.out.println("Insert student's id: ");
        short id = UserInput.getShort();
        int pos = MyUtils.searchID(S, id);
        if (pos >=0 )
            System.out.println("Id: "+id+"found on possition: "+pos+"with :\n"+S[pos]);
        else 
            System.out.println("Id "+id+"NOT FOUND!");

    }
    
}
