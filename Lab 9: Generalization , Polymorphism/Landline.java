public class Landline extends Phone {
    // Default constructor - generates a random landline number
    public Landline(){
        String s ="2";
        for(int i=1; i<=9; i++)
            s += (int)(Math.random()*10);
        setNumber(s);
    }
    // Constructor with given number
    public Landline(String number){
        super(number);
    }
    // Constructor with number and existing call durations
    public Landline(String number, int sec2Landline, int sec2Mobile){
        super(number,sec2Landline,sec2Mobile );
    }
     // Simulates dialing a number and increments the respective call duration
    public void dial(String phoneNumber){
        String msg;
        if(phoneNumber.charAt(0)=='2'){
            msg = "Landline";
            setsec2Landline(getsec2Landline()+(int)(Math.random()*1001));
        }
        else if(phoneNumber.charAt(0) == '6'){
            msg = "Mobile";
            setsec2Mobile(getsec2Mobile()+(int)(Math.random()*1001));
        }
        else {
            System.out.println("dial: Wrong number");
            return;
        }
        System.out.println("Call from landline "+getNumber()+"to "+msg+" number "+phoneNumber);
    }
    // Calculates total cost of calls made from this landline
    public double cost(){
        return 0.02*getsec2Landline() + 0.05* getsec2Mobile();
    }
    // String representation of the Landline object
    public String toString(){
        return super.toString();
    }
}
