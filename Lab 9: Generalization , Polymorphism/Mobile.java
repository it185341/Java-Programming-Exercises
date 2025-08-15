public class Mobile extends Phone{
    // Default constructor - generates a random mobile number
    public Mobile(){
        String s = "6";
        for(int i=1;i<=9;i++)
            s += (int)(Math.random() * 10);
        setNumber(s);
    }
     // Constructor with a given number
    public Mobile(String number){
        super(number);
    }
    // Constructor with number and existing call durations
    public Mobile(String number, int sec2Landlinea, int sec2Mobile){
        super(number,sec2Landlinea,sec2Mobile );
    }
    // Returns a string representation of the mobile object
    public String toString(){
        return super.toString();
    }
    // Simulates dialing a number and increments the respective call duration
    public void dial(String phoneNumber){
        String msg;
        if(phoneNumber.charAt(0) == '2'){ // Call to landline
            msg = "Landline";
            setsec2Landline(getsec2Landline()+(int)(Math.random()*1001));
        }
        else if(phoneNumber.charAt(0) == '6'){ // Call to another mobile
            msg = "Mobile";
            setsec2Mobile(getsec2Mobile()+(int)(Math.random()*1001));
        }
        else {
            System.out.println("dial: Wrong telephone number");
            return;
        }
        System.out.println("Call from mobile "+getNumber()+" to "+msg+" number  "+phoneNumber);
    }
    
    public double cost(){
        return 0.06*getsec2Landline() + 0.07*getsec2Mobile();
    }
    
}
