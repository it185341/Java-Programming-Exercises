public class VehicleDemo {

    public static void main(String[] args) {
        int place; // Position in the array for each vehicle
        System.out.println("Enter number of Vehicles .... \n"); // Ask the user for the total number of vehicles
        int n = UserInput.getInt();
        Vehicle [] V = new Vehicle[n];
        /*================== Cars ==================
        Fill approximately 70% of the vehicles as Cars */
        for (int i =0;i<Math.round(n*0.7);i++){
            System.out.println("Enter Car data: (number of doors) ");
            int doors = UserInput.getInt();
            System.out.println("Year of manufacture: ");
            int year = UserInput.getInt();
            System.out.println("Owner:  ");
            String owner = UserInput.getString();
            System.out.println("Engine displacement (cc):");
            int cc = UserInput.getInt();
            System.out.println("Horsepower: ");
            int hp = UserInput.getInt();
            System.out.println("License plate number: ");
            String licensePlate = UserInput.getString();
            Car c = new Car(owner, licensePlate, year, cc, hp, doors);
            do{
                place = (int)(Math.random() *n );
                System.out.println("Random position chosen:  = "+place);
            }
            while(V[place]!=null);
            V[place] = c;
        }
        /* ================== Trucks ==================
        Fill approximately 15% of the vehicles as Trucks */
        for (int i =0;i<Math.round(n*0.15);i++){
            System.out.println("Enter Truck data: (number of axels) ");
            int doors = UserInput.getInt();
            System.out.println("Year of manufacture: ");
            int year = UserInput.getInt();
            System.out.println("Owner ");
            String owner = UserInput.getString();
            System.out.println("Engine displacement (cc): ");
            int cc = UserInput.getInt();
            System.out.println("Horsepower: ");
            int hp = UserInput.getInt();
            System.out.println("License plate number: ");
            String licensePlate = UserInput.getString();
            Truck t = new Truck(owner, licensePlate, year, cc, hp, doors);
            // Assign to a random empty position in the array
            do{
                place = (int)(Math.random() *n );
                System.out.println("Random position chosen = "+place);
            }
            while(V[place]!=null);
            V[place] = t;
        }
        /* ================== Motorcycles ==================
        Fill the remaining positions with Motorcycles */
        for (int i =0;i<n - Math.round(n*0.7) - Math.round(0.15*n);i++){ 
            System.out.println("Enter Motorcycle data: (has basket - 1 or not - 0) ");
            int doors = UserInput.getInt();
            System.out.println("Year of manufacture:  ");
            int year = UserInput.getInt();
            System.out.println("Owner:");
            String owner = UserInput.getString();
            System.out.println("Engine displacement (cc): ");
            int cc = UserInput.getInt();
            System.out.println("Horsepower: ");
            int hp = UserInput.getInt();
            System.out.println("License plate number: ");
            String licensePlate = UserInput.getString();
            Motorcycle m = new Motorcycle(owner, licensePlate, year, cc, hp, doors);
            do{
                place = (int)(Math.random() * n );
                System.out.println("Random position chosen = "+place);
            }
            while(V[place]!=null);
            V[place] = m;
        }
        System.out.println("===================================================");
        for(int i=0;i<n;i++){
            System.out.println(i+"Vehicle ");
            System.out.println("-----------------------------------------------");
            System.out.println(V[i]);
            V[i].drive();
            System.out.println("===============================================");
        }
        for(int i=0;i<n;i++){
            V[i].transferOwnership("Asdre");
        }
        System.out.println("=================Change of Owner==============");
        for(int i=0;i<n;i++){
            System.out.println(i+" Vehicle: ");
            System.out.println("-----------------------------------------------");
            System.out.println(V[i]);
            V[i].drive();
            System.out.println("===============================================");
        }
    }
}
