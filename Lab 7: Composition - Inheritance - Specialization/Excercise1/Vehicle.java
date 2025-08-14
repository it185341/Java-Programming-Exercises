public class Vehicle {
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
    // Constructor without owner and license plate number
    public Vehicle(SteeringSystem ss,Engine e){
        this.steeringSystem = ss;
        this.engine = e;
    }
    // Full constructor
    public Vehicle(String owner, String licensePlateNumber, int year, SteeringSystem ss, Engine e){
        this.owner = owner; 
        this.licensePlateNumber = licensePlateNumber;
        this.year = year;
        this.steeringSystem = ss;
        this.engine = e;
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
        return("\nOwner: "+owner+"\nLicense Plate Number: : "+licensePlateNumber+"\nYear of Manufacture: "+year+"\nEngine Displacement: "+engine.getDisplacement()+"\nHorsepower: : "+engine.getHorsepower()+"\n");
    }
}
