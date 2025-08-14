public class Engine {
    private int cc; // Engine displacement in cubic centimeters 
    private int hp; //Engine horsepower 
    
    public Engine(){};
    public Engine(int cc, int hp){
        this.cc = cc;
        this.hp = hp;
    }
    public void setDisplacement(int cc){
        this.cc = cc;
    }
    public int getDisplacement(){
        return cc;
    }
    
    public void setHorsepower(int hp){
        this.hp = hp;
    }
    public int getHorsepower(){
        return hp;
    }       
    //Starts the engine.
    public void  start(){
        System.out.println("The vehicle engine is now running.");
    }
    //Moves the vehicle forward.
    public void move(){
        System.out.println("The vehicle is moving.");
    }
    //Stops the engine.
    public void stop(){
        System.out.println("The vehicle engine is turned off.");
    }
}
