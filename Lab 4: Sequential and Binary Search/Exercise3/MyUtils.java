public class MyUtils {
    public static int SearchLastName(Student[] S,String F){
        for(int i=0;i<S.length;i++){ 
            if(S[i].getLsName().equals(F))  
                return i; //
        }
        return -1; // if the student is not found
    }
    public static int searchID(Student [] S, short id){
        int start=0;  // Index of the first element in the search range
        int end = S.length -1;  // Index of the last element in the search range
        while(start <= end){ // Continue searching while range is valid
            int mid = (start + end)/2; // Find the middle index
            short IdStudent = S[mid].getId(); // Get the student's ID at the middle index
            if(IdStudent == id) // If the ID matches, return the index
                return mid;
            else if(id < IdStudent) // If the search ID is smaller, search in the left half
                end = mid -1 ;
            else  // If the search ID is larger, search in the right half
                end = mid +1;
        }
        return -1; // Return -1 if the ID is not found
    }
  
    public static int recursiveSearchByID(Student S[], short key, int left, int right){
        int mid;
        // Base case: if the search range is invalid, the element is not found
        if(right < left) 
            return -1;
        mid = (left +right) / 2;  // Find the middle index
        // If the middle student's ID is less than the key, search in the right half
        if(S[mid].getId() < key)
            return recursiveSearchByID(S,key,mid+1,right);
        // If the middle student's AM is greater than the key, search in the left half
        else if(S[mid].getId() > key)
            return recursiveSearchByID(S,key,left,mid -1);
         // If the ID matches the key, return the index
        else 
            return mid;
    }
}
