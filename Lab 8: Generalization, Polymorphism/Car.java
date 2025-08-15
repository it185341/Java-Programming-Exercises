class Car extends Vehicle{
    private int doors; // Number of doors in the car
    
    public Car(){} //// Default constructor
    // Constructor with only number of doors
    public Car(int d){ 
        this("","", 0, 0, 0, d);
    }
    // Constructor with doors and owner
    public Car(int d,String s){
        this(s,"",0,0,0,d);
    }
    // Full constructor
    public Car(String owner, String licensePlateNumber,int year,int cc, int hp, int d){
        super(owner, licensePlateNumber, year, cc, hp);
        this.doors =d;
    }
    //----------Setters & Getters---------
    public void setDoors(int d){
        this.doors = d;
    }
    public int getDoors(){
        return doors;
    }
    // Simulate driving a car
    public void drive(){
        System.out.println("You need a car driving license dear "+this.getOwner());
    }    
    // String representation of the car
    public String toString(){
        return super.toString()+"Number of doors = "+doors;
    }
}
