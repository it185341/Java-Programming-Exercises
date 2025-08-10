public class MyUtils {
    public static int searchID(Student [] S, short id){
        int start=0;
        int end = S.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            short IdStudent = S[mid].getId(); // pairnw to am tou foititi
            if(IdStudent == id)
                return mid;
            else if(id < IdStudent)
                end = mid -1 ;
            else 
                end = mid +1;
        }

        return -1;
    }
}


