    /**
     * Finds and returns the index of the maximum element in the array.*
     * Returns -1 if the array is empty.
     */
    public static int findMax(int m[]){
        int max=m[0];
        int maxIndex = 0;
        int i;
        if(m.length <=0) return -1;  //check to avoid out of bounds
        for(i=0;i<m.length;i++){
            if(m[i]>max){
                max = m[i];
                maxIndex= i;
            }
        }
        return maxIndex;
    }
    /**
     * Calculates and returns the average value of the elements in the array.
     */
    public static double findAvg(int m[]){
        double count = 0;
        int i;
        for(i=0; i<m.length;i++){
            count = count + m[i];
        }
        double avg = count/(double)m.length; // Calculate average
        return avg;
    }
    /**
     * Displays the elements of the array on the console.
     */
    public static void display(int m[]){
        System.out.println("Array is : ");
        // Print each element separated by a tab
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+"\t");
        }
        System.out.println();
    }
    
     /**
     * Swaps the elements at indices i and j in the array.*
     * Prints an error message if either index is out of bounds.
     */
    public static void swap(int m[], int i, int j){
        // Check if both indices are within the bounds of the array
        if (i<m.length && j<m.length){
            int temp = m[i];  // Store value temporarily
            m[i] = m[j];  // Assign value at j to i
            m[j] = temp;  // Complete the swap
        }    
        else
            System.out.println("Swap not possible. One or both indices are out of array bounds.");
               
    }
    public static void main(String[] args) {
       System.out.print("Enter the size of the array: ");
       int n = UserInput.getInteger();  // Read user input (assumes UserInput is a helper class)
       int [] m = new int [n]; // Create array with user-defined size
       // Read each element of the array from user input
       for(int i = 0; i<m.length; i++){
           System.out.print("Enter element " +i+ ": ");
           m[i] = UserInput.getInteger();
       }
       // Find and display the maximum element and its index
       int maxIndex = findMax(m);
       if(maxIndex != -1) {
            System.out.println("The maximum element in the array is: "+m[findMax(m)]);
       }
       else {
            System.out.println("The array is empty."+ findAvg(m));
       }
       // Calculate and display the average value of the array
       System.out.println("The average of the array elements is: " + findAvg(m));
       display(m); // Display all elements of the array
       int i =3 , j=2; // Choose two indices to swap 
       System.out.println("Swapping elements at indices "+i+" and "+j);
       swap(m , i ,j ); // Perform the swap
       display(m); // Display array after swapping
    }
    
}
