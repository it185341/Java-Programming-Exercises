public class Student {
    private String name; //Student’s first name
    private String lsName; //Student's last name
    private short id; 
    private short year; // student’s year admission
    
    
    public Student(){} //Default Constructor
    //Full Constructor
    public Student(String name,String lsName,short id, short year){
        this.name = name;
        this.lsName = lsName;
        this.id = id;
        this.year = year;     
    }
    
    // ————Setters & Getters————————
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setLsName(String lsName){
        this.lsName = lsName;
    }
    public String getLsName(){
        return lsName;
    }
    
    public void setId(short id){
        this.id = id;
    }
    public short getId(){
        return id;
    }
    
    public void setYear(short year){
        this.year = year;
    }
    public short getYear(){
        return year;
    }
    
    public String toString(){
        return("First Name: "+name+"\nLast Name: "+lsName+"\nID: "+id+"\nAdmission year: "+year);
    }
}
