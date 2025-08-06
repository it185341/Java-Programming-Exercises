public class Palind {
  static int rev=0;
  public static int REV(int num){
      if(num>0){
          rev = (rev*10) + (num % 10);
          System.out.println(rev*10+" "+num%10+" "+rev); // This is just to understand how it works
          REV(num/10); //Recursive call with the number divided by 10
      }
      return rev;
}

public static void main(String[] args) {
        int count = 0;
        int x = 0;
        while (count < 10){ // Repeat 10 times to check 10 numbers
            System.out.print("Dwse enan aritmo apo to 1 ews 99.999: ");
            x = UserInput.getInteger(); 
            while (x<1 || x>99999){ // Input validation: number must be in range
                System.out.print("O arithmos pou edwses den einai swstos ksana prospathise: ");
                x= UserInput.getInteger();
                count++;
            }
            count++;
            int y = Palind.REV(x);
            System.out.println(y);
            if(x==y)
                System.out.println(+x+"is a palindrome number");
            else 
                System.out.println(+x+"is not a palindrome number");
        }
    }
