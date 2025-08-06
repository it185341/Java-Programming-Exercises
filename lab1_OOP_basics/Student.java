public class Student {
    int id; //student's id
    String name;  //student's name
    int absences; //student's absences
    double theory; //student's theory grade
    double lab; // student's lab grade


    public Student() {} // default constructor
  
    // constructor with id and name,  useful when other fields are not yet set
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Constructor with all fields
    public Student(int id,String name, int absences, double theory, double lab){
        this.id = id;
        this.name = name ;
        this.absences = absences;
        this.theory = theory;
        this.lab = lab;
    }

  //Getters & Setters for all fields
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String Name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void getAbsences(int absences){
        this.absences = absences;
    }
    public int setAbsences(){
        return absences;
    }

    public void setTheory(double theory){
        this.theory = theory;
    }
    public double getTheory(){
        return theory;
    }

    public  void setLab (double lab ){
        this.lab  = lab ;
        }
    public double getLab (){
        return lab ;
    }

    public String toString(){
        return ("Student Information: \n Name: "+name+ "(ID: "+id+")" +"\n Final Grade: "+computeFinal()+ "\n Theory Grade: " +theory+ "\n Lab Grade "+lab);
    }
    public double computeFinal(){
        return theory * 0.7 + lab * 0.3;
    }
}
