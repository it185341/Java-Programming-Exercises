abstract class Phone {
    private String number; // Phone number
    private int sec2Landline; // Total seconds of calls made to landlines
    private int sec2Mobile; // Total seconds of calls made to mobiles
    
    public Phone(){} // Default constructor
    
    // Constructor with only phone number
    public Phone(String number){ 
        this.number = number;
    }
    // Constructor with seconds to landline and seconds to mobile
    public Phone(int sec2Landline, int sec2Mobile){
        this.sec2Landline = sec2Landline;
        this.sec2Mobile = sec2Mobile;      
    }
    // Constructor with phone number and call duration data
    public Phone(String number, int sec2Landline, int sec2Mobile){
        this.number = number;
        this.sec2Mobile = sec2Mobile;
        this.sec2Landline = sec2Landline;
    }
    //----- Setters & Getters-----
    public void setNumber(String number){
        this.number = number;
    }
    
    public void setsec2Mobile(int sec2Mobile){
        this.sec2Mobile = sec2Mobile;
    }
    
    public void setsec2Landline(int sec2Landline){
        this.sec2Landline = sec2Landline;
    }
    
    public String getNumber(){
        return number;
    }
    
    public int getsec2Mobile(){
        return sec2Mobile;
    }
    public int  getsec2Landline(){
        return sec2Landline;
    }
    // String representation of the phone object
    public String toString(){
        return("Number: "+number+"\nTime to landlines"+sec2Landline+"\nTime to mobiles:: "+sec2Mobile);
    }
  
    abstract public void dial(String phoneNumber);   // Abstract methods to be implemented by subclasses
    abstract public double cost(); // Calculates total cost of calls made

}
