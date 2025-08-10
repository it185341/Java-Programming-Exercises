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
        // If the middle student's ID is greater than the key, search in the left half
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
    
    // Sorts an array of Student objects by year of enrollment using the Bubble Sort algorithm
    public static void bubbleSortEE(Student [] S){
        int i,j;
        Student temp; // Temporary variable for swapping
        boolean flag; // Indicates whether a swap was made in the current pass
        //Controls the number of passes
        for(i=0;i<S.length;i++){
            flag = true; // Assume the array is sorted at the start of each pass
            //Compare adjacent elements from the end towards i+1
            for(j=S.length-1;j>= i+1; j--){ // Compare by year of enrollment
                if(S[j].getYear() < S[j-1].getYear()){
                    // Swap the two elements
                    temp = S[j];
                    S[j] = S[j-1];
                    S[j-1] = temp;
                    flag = false; // A swap was made, so the array might still be unsorted
                } 
            }
        // If no swaps were made, the array is already sorted; exit early
        if (flag) return;
        }
    }
    public static void quickSort(Student [] list){
        QSort(list,0,list.length-1);
    }
    // Quick Sort method for sorting an array of Student objects by ID
    public static void QSort(Student []  list, int first, int last){
        // If the portion of the array has more than one element
        if(last>first){
            int pivotIndex = partition(list,first,last);  // Partition the array and get the pivot index
            QSort(list,first,pivotIndex -1) ; // Recursively sort the left sub-array
            QSort(list,pivotIndex +1, last); // Recursively sort the right sub-array
        }
    }
    // Partition method: rearranges elements around a pivot
    public static int partition(Student [] list,int first,int last){
        Student pivot = list[first];  // Choose the first element as the pivot
        int low = first + 1; // Index for scanning from the left
        int high = last; // Index for scanning from the right
        // Repeat until the two indices cross
        while(high > low){
            // Move 'low' rightward while elements are less than or equal to the pivot
            while(low <= high && list[low].getId() <= pivot.getId()) 
                low++;
             // Move 'high' leftward while elements are greater than the pivot
            while(low <= high && list[high].getId() > pivot.getId())
                high --;
            // Swap the two elements if needed
            if(high > low){
                Student temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            } 
        }
        // Move 'high' leftward to find the correct pivot position
        while(high > first && list[high].getId() >= pivot.getId())
            high --;
        // Place the pivot in its correct sorted position
        if(pivot.getId() >list[high].getId()){
            list[first] = list[high];
            list[high] = pivot;
            return high; // Return the pivot's new index
        }
        else {
            return first; // Pivot remains in place
        }
    }
}
