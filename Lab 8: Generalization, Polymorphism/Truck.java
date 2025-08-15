class Truck extends Vehicle{
     private int axles; // Number of axles in the truck
     
     private Truck(){}; // Default constructor
     // Constructor with only axles
     private Truck(int axles){
         this("","", 0, 0, 0, axles);
     }
     // Constructor with axles and owner
     private Truck(int axles, String owner){
         this(owner,"",0,0,0,axles);
     }
      // Full constructor
     public Truck(String owner, String licensePlateNumber,int year,int ss, int hp, int a){
        super(owner,licensePlateNumber,year,ss,hp);
        axles = a;
    }
    //------Setters & Getters--------
    public void setAxles(int a){
        axles = a;
    }
    public int getAxles(){
        return axles;
    }
    // Simulate driving a truck
    public void drive(){
        System.out.println("You must be a professional driver.This is a "+ axles + "axcels truck Mr "+this.getOwner());
    }    
     // String representation of the truck
    public String toString(){
        return super.toString()+"Number of axles: "+axles;
    }
}
