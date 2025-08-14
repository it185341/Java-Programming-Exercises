
public class VehicleDemo {

    public static void main(String[] args) {
        int n =3; //Number of vehicles
        Vehicle [] V = new Vehicle [n]; // Array to hold vehicle objects
        //First Vehicle
        SteeringSystem s = new SteeringSystem();
        Engine e = new Engine(1400,60); // 1400 displacement, 60 horsepower
        V[0] = new Vehicle(2002,s,e);
        V[0].setOwner("Ioannou");
        V[0].setLicensePlateNumber("AAA1234");
        s = new SteeringSystem();
        e = new Engine(1400,100); // 1400  displacement, 100 horsepower
        //Second Vehicle
        V[1] = new Vehicle(2014, s, e);
        V[1].setOwner("Georgiou");
        V[1].setLicensePlateNumber("BBB2345");
        //Third Vehicle
        s = new SteeringSystem();
        e = new Engine(2000,200);// 2000 cc displacement, 200 horsepower
        V[2] = new Vehicle(2021, s, e);
        V[2].setOwner("Paulou");
        V[2].setLicensePlateNumber("ABAB1345");
        // Ask user for a vehicle index to display its displacement
        System.out.println("For which vehicle do you want to see the engine displacement from 0 to 2?");
        int k = UserInput.getInt();
        if(k>=0 && k<=n){
            System.out.println("Vehicle " + k + " has displacement: " + V[k].getEngine().getDisplacement() + " cc");
        }
        else {
            System.out.println("Invalid vehicle number.");
        }
        // Ask user for a vehicle index to display its horsepower
        System.out.println("For which vehicle do you want to see the horsepower from 0 to 2 ?");
        k = UserInput.getInt();
        if(k>=0 && k<n){
            System.out.println("Vehicle "+k+" has horsepower: "+V[k].getEngine().getHorsepower());
        }
        else{
            System.out.println("Invalid vehicle number.");
        }
        // Ask the user which vehicle they want to see the owner and year of manufacture
        System.out.println("For which vehicle do you want to see the owner and year of manufacture from 0 to 2?");
        k = UserInput.getInt(); 
        if(k>=0 && k<n){
            System.out.println("Vehicle: "+k+" has owner "+V[k].getOwner()+" and year of manufacture "+V[k].getYear());
        }
        else{
            System.out.println("Invalid vehicle number.");
        }
        // Demonstration of basic vehicle operation sequence
        V[0].getSteeringSystem().start();
        V[0].getEngine().start();
        V[0].getEngine().move();
        V[0].getSteeringSystem().turnRight();
        V[0].getSteeringSystem().turnLeft();
        V[0].getSteeringSystem().stop();
        V[0].getEngine().stop();
    }
}
