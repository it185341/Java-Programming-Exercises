public class MyUtils {
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
}


