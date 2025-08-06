import java.util.Scanner; // Required to read input from the user
  
public class Hanoi { 
    static void moveDisks(int n, char A, char C, char B){ 
        if(n==1){ 
            // Base case: Only one disk, move it directly
            System.out.println("Move disk 1 from "+A+" to "+C); 
            return; 
        } 
        moveDisks(n-1,A,B,C); // Step 1: Move (n-1) disks from source to auxiliary rod
        System.out.println("Move disk "+n+" from "+A+" to "+C);  // Step 2: Move the remaining disk to the target rod
              moveDisks(n-1,B,C,A); // Step 3: Move the (n-1) disks from auxiliary to target rod
    } 
  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Dwse to plithos ton diskwn: "); 
        int disks = sc.nextInt(); 
        moveDisks(disks, 'A', 'C', 'B'); // disks=arithmos diskwn, A=apo pou ksekinisa B=boithitikos stilos, C=pou teleiwnw 
    } 
} 
