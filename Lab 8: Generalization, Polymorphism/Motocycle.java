class Motorcycle extends Vehicle {
    private int basket; // Indicates whether the motorcycle has a basket ( 0 for no, 1 for yes)
    public Motorcycle(){}// Default constructor
    // Constructor with only basket info
    public Motorcycle(int b){
        this("","",0,0,0,b);
    }
    // Constructor with basket and owner
    public Motorcycle(int b, String s){
        this(s,"",0,0,0,b);
    }
    // Full constructor
    public Motorcycle(String owner,String licensePlateNumber, int year, int cc, int hp, int b){
        super(owner, licensePlateNumber, year, cc, hp);
        basket = b;
    }
    //-----Setters & Getters-----
    public void setBasket(int b){
        basket = b;
    }
    public int getBasket(){
        return basket;
    }
    // Simulate driving a motorcycle
    public void drive(){
        System.out.println("Your car driving license is not enough. You need a special license dear "+this.getOwner());
    }
    // String representation of the motorcycle
    public String toString(){
        return super.toString()+ "Basket "+basket;            
    }
}
