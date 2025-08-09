public class MyUtils {
        public static int SearchLastName(Student[] S,String F){
        for(int i=0;i<S.length;i++){ 
            if(S[i].getLsName().equals(F))  
                return i; //
        }
        return -1; // if the student is not found
    }
}
