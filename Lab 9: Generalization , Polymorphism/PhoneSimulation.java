import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PhoneSimulation{

    public static void main(String[] args) throws IOException {
        // Total durations and costs
        int landline2LandlineTime = 0, landline2MobileTime  =0;
        int mobile2LandlineTime = 0, mobile2MobileTime = 0;
        double totalcost = 0, landlineCost =0, mobileCost = 0;
        double cost2Landline = 0, cost2Mobile = 0;
        int x; // Number of calls to simulate
        int N; // Number of phones in the system
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rnd = new Random();
        int r1;
        String s;
        // Check if number of phones is provided as a command-line argument
        if(args.length !=0){
            N = Integer.parseInt(args[0]);
        }
        else {
            System.out.print("Number of business phones: ");
            N= Integer.parseInt(br.readLine());
        }
        // Create array of Phone objects
        Phone[] phones = new Phone [N];
        for(int i=0;i<N;i++){
            r1 = rnd.nextInt(100); /// Random number 0-99
            if (r1 <60){
                phones[i] = new Landline();
                System.out.println((i+1)+" : Landline");
            }
            else {
                phones[i] = new Mobile();
                System.out.println((i+1)+ " : Mobile");
            }
        }
        System.out.println ("....Done ");
        x = rnd.nextInt(1900) +100; // Random number of calls between 100 and 2000
        System.out.println(x +" calls to be made ...");
        System.out.print("Press enter to start calling...");
        br.readLine();
        // Simulate calls
        for(int i =0;i<x;i++){
            r1 = rnd.nextInt(N); // Select random phone
            // Randomly decide if the target is landline (60%) or mobile (40%)
            if(rnd.nextDouble()<0.6)
                s = "2";
            else 
                s = "6";
            // Add remaining 9 digits randomly
            for(int k=1;k<=9;k++)
                s+= rnd.nextInt(10);
            phones[r1].dial(s); // Make the call
            
        }
        // Display phone catalog and costs
        System.out.println("Phone Catalog:");
        System.out.println("No.\tNumber\tCost");
        for(int i=0; i<N;i++){
            System.out.println(i+1+"\t"+phones[i].getNumber()+"\t"+phones[i].cost());
                if(phones[i].getNumber().charAt(0) == '2'){
                    landline2LandlineTime += phones[i].getsec2Landline();
                    landline2MobileTime += phones[i].getsec2Mobile();
                    landlineCost += phones[i].cost();
                }
                else{
                    mobile2LandlineTime += phones[i].getsec2Landline();
                    mobile2MobileTime += phones[i].getsec2Mobile();
                    mobileCost += phones[i].cost();
                }
                totalcost += phones[i].cost();    
        }
        cost2Landline= 0.02*landline2MobileTime + 0.06*mobile2MobileTime ;
        cost2Mobile = 0.05*landline2MobileTime + 0.07*mobile2MobileTime ;
        
        // Print summary
        System.out.println("Total call duration from landlines: "+(landline2LandlineTime + landline2MobileTime)+" sec. Cost "+landlineCost);
        System.out.println("Total call duration from mobiles:"+(mobile2LandlineTime + mobile2MobileTime)+" sec. Cost "+mobileCost);
        System.out.println("Total cost of calls to landlines:: "+ cost2Landline+ " euro");
        System.out.println("Total cost of calls to mobiles:  "+cost2Mobile + " euro");
        System.out.println("Total Cost: "+totalcost);
    }
}
