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
    public static void InsertSortID(Student [] S){
        // Iterate over the array starting from the second element
        for(int i=1;i<S.length;i++){
            Student x =S[i]; // Store the current element to be inserted
            int j = i-1;
            // Shift elements that are greater than x one position to the right
            while(j>=0 && S[j].getId()>x.getId()){
                S[j+i] = S[j]; // Move element one position ahead
                j = j-1;
            }
            S[j+1] = x;  // Insert the stored element at the correct position
        }
    }
    // Sorts an array of Student objects by last name using the Selection Sort algorithm
    public static void selectSortLastName(Student [] S){
        int posMin; // Position of the smallest element found
        Student min;  // The smallest Student object found in the current iteration
        // Iterate through each position in the array
        for(int i=0;i<S.length;i++){
            // Assume the current element is the smallest
            min = S[i];
            posMin = i;
            //Find the actual smallest element in the remaining array
            for(int j=0;j<S.length;j++)
                if(S[j].getLsName().compareTo(min.getLsName()) <0){
                    min = S[j];
                    posMin = j;
                }
            // Swap the found smallest element with the current position
            S[posMin] = S[i];
            S[i] = min;
        } 
    }

}
