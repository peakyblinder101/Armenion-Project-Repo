import java.util.Scanner;
public class DistanceRoute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		   double speed = 0;
		   double distance = 0;
		   int choice1;
		   int choice2;
		   double ds = 0;
		   int hr = 0;
		   int mins = 0;
		   System.out.println("Enter your speed: ");
		   System.out.print("---->");
		   speed = scan.nextDouble();
		   System.out.println("Start - Cebu City (South Bus Terminal near in  Emall)");
		   System.out.println("Route 1 - Minglanilla");
		   System.out.println("Route 2 - San Fernando");
		   System.out.println("Route 3 - Carcar");
		   System.out.println("\nIs Route 4.1 (Barili) obstructed?\n[1] Yes | [2] No");
		   System.out.print("---->");
		   choice1 = scan.nextInt();

		   if(choice1 == 1){ // YES choice 1
		   System.out.println("Route 4.2 - Sibonga");
		   System.out.println("\nIs Route 4.2.1 (Dumanjug) obstructed?\n[1] Yes | [2] No");
		   System.out.print("---->");
		   choice2 = scan.nextInt();

		   if(choice2 == 1){ // YES choice 2
		   System.out.println("\nRoute 3: ");
		   System.out.println("Start - Cebu City (South Bus Terminal near in  Emall)");
		   System.out.println("Route 1 - Minglanilla");
		   System.out.println("Route 2 - San Fernando");
		   System.out.println("Route 3 - Carcar");
		   System.out.println("Route 4.2 - Sibonga");
		   System.out.println("Route 5 - Argao");
		   System.out.println("Route 5.1 - Ronda");
		   System.out.println("Route 5.2 - Alcantara");
		   System.out.println("END - Moalboal");
		   distance = 102;
		   }else { // NO choice 2
		   System.out.println("\nRoute 2: ");
		   System.out.println("Start - Cebu City (South Bus Terminal near in Emall)");
		   System.out.println("Route 1 - Minglanilla");
		   System.out.println("Route 2 - San Fernando");
		   System.out.println("Route 3 - Carcar");
		   System.out.println("Route 4.2 - Sibonga");
		   System.out.println("Route 4.1.2 - Alcantara");
		   System.out.println("Route 4.2.1 - Dumanjug");
		   System.out.println("END - Moalboal");
		   distance = 96.2;
		   }
		   } else { // NO choice 1
		   System.out.println("\nRoute 1: ");
		   System.out.println("Start - Cebu City (South Bus Terminal near in Emall)");
		   System.out.println("Route 1 - Minglanilla");
		   System.out.println("Route 2 - San Fernando");
		   System.out.println("Route 3 - Carcar");
		   System.out.println("Route 4.1 - Barili");
		   System.out.println("Route 4.1.1 - Dumanjug");
		   System.out.println("Route 4.1.2 - Alcantara");
		   System.out.println("END - Moalboal");
		   distance = 84.9; 
		   }
		   System.out.printf("\nSpeed = %.2f km/hr", speed);
		   System.out.printf("\nTotal distance = %.2f km", distance);
		   //System.out.printf("\nEstimated time of arrival = ~%.2f hours", distance/speed);
		   //System.out.println();
		   ds = distance/speed;
		   hr = (int)ds;
		   mins = (int)((ds - hr)*60); 
		   System.out.println("\nEstimated time of arrival "+hr+" hr and "+mins);
	}

}


