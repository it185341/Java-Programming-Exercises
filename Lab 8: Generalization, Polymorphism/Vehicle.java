class  SteeringSystem{
    // Move vehicle forward
    public void moveForward(){
        System.out.println("The vehicle moves forward");
    }
    // Stop the vehicle
    public void stop(){
        System.out.println("The vehicle stops");
    }
    // Turn vehicle left
    public void turnLeft(){
        System.out.println("The vehicle turns left");
    }
    // Turn vehicle right
    public void turnRight(){
        System.out.println("The vehicle turns right");
    }
}

// Class representing the Engine of a vehicle
class Engine {
    private int displacement;
    private int horsepower;
    
    public Engine (){}; // Default constructor
    // Full constructor
    public Engine (int cc, int hp){
        this.displacement = cc;
        this.horsepower = hp;
    }
    //-------Getters & Setters----------
    public void setCC(int cc){
        this.displacement = cc;
    }
    public int getCC(){
        return displacement ;
    }
    
    public void setHP(int hp){
        this.horsepower = hp ;
    }
    public int getHP(){
        return horsepower;
    }       
     // Engine operations
    public void start(){
        System.out.println("The vehicle is started");
    }
    
    public void move(){
        System.out.println("The vehicle is moving");
    }
    
    public void stop(){
        System.out.println("The vehicle is stopped");
    }
}
// Abstract class representing a Vehicle
abstract class Vehicle {
    private String owner;  // Owner's full name
    private String licensePlateNumber; // Vehicle's license plate number
    private int year;
    private SteeringSystem steeringSystem;
    private Engine engine;

    public Vehicle(){} // Default constructor
    // Constructor without owner and license plate number
    public Vehicle(int year,SteeringSystem ss,Engine e){
        this.year = year;
        this.steeringSystem = ss;
        this.engine = e;
    }
    // Full constructor
    public Vehicle(String owner, String licensePlateNumber, int year, int cc, int hp ){
        this.owner = owner; 
        this.licensePlateNumber = licensePlateNumber;
        this.year = year;
        this.steeringSystem = new SteeringSystem();
        this.engine = new Engine(cc,hp);
    }
    //-------- Getters & Setters------------------
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    
    public void setLicensePlateNumber(String licensePlateNumberr){
        this.licensePlateNumber = licensePlateNumber;
    }
    public String  getLicensePlateNumber(){
        return licensePlateNumber;
    }
    
    public void setYear(int year){
        this.year = year; 
    }
    public int getYear(){
        return year;
    }
    
    public void setSteeringSystem(SteeringSystem ss){
        this.steeringSystem = ss;
    }
    public SteeringSystem getSteeringSystem(){
        return steeringSystem;
    }
    
    public void setEngine(Engine e){
        this.engine = e ;
    }
    public Engine getEngine(){
        return engine;
    }
    // String representation of the vehicle
    public String toString(){
        return("\nOwner: "+owner+"\nLicense Plate Number: : "+licensePlateNumber+"\nYear of Manufacture: "+year+"\nEngine Displacement: "+engine.getCC()+"\nHorsepower: : "+engine.getHP()+"\n");
    }
    public void transferOwnership(String newOwner){
        System.out.println("Ownership is transferres from "+owner+" to "+newOwner); 
        owner= newOwner;
    }
    abstract public void drive();

}
