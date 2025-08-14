
public class Employee {
    private String name;
    private int id;
    private String specialty;
    private String address;
    
    public  Employee(){};  // Default constructor
    //Full constructor
    public  Employee(String name, int id, String specialty, String address){
        this.name = name;
        this.id = id;
        this.specialty = specialty;
        this.address = address;
    }
    //------Setters & Getters---------
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id ;
    }
    
    public void setSpecialty(String specialty ){
        this.specialty = specialty;
    }
    public String getSpecialty(){
        return specialty ;
    }
    
    public void setAddress(String address ){
        this.address = address;
    }
    public String getAddress(){
        return address ;
    }
    // Returns a string representation of the Employee object
    public String toString(){
        return("\nName: "+name+"\nID: "+id+"\nSpecialty: "+specialty+"\nAddress: "+address);
    }
}
