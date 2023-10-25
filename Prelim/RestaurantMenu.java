
import java.util.Scanner;
public class RestaurantMenu {

	public static void main(String[] args) {
		
		  	double c1 = 100.00, c2 = 150.00, c3 = 200.00;
		  	double r1 = 35.00, r2 = 50.00;
		  	int qtyC1 = 0, qtyC2 = 0, qtyC3 = 0, qtyR1 = 0, qtyR2 = 0;
		  	double resultC1 = 0, resultC2 = 0, resultC3 = 0, resultR1 = 0, resultR2 = 0;
		  	double totalPhp = 0, totalDollar = 0;
		  	
		  	String type = null;
		  	String order = null;
		  	String add = null;
		  	
		  		Scanner scan = new Scanner(System.in);
		  			
		  			do{
		  			System.out.println("Menu:							Add Ons:");
		  			System.out.println("C1 - Php 100.00						R1 - Php 35.00");
		  			System.out.println("C2 - Php 150.00						R2 - Php 50.00");
		  			System.out.println("C3 - Php 200.00						");
		  			
		  			System.out.println("\nWhat do you want to order C1, C2, C3? ");
		  			order = scan.next();
		  			
		  			// asking the user how many food and drinks user want to order
		  			System.out.println("\nFood									Quantity");
		  			if(order.equals("C1") || order.equals("c1")){
		  			System.out.print("C1									   ");
		  				qtyC1 = scan.nextInt();
		  				}
		  			else if(order.equals("C2") || order.equals("c2")){ 
		  			System.out.print("C2									   ");
		  			qtyC2 = scan.nextInt();
		  			}
		  			else if(order.equals("C3") || order.equals("c3")){ 
		  			System.out.print("C3									   ");
		  				qtyC3 = scan.nextInt();
		  			}
		  			
		  			System.out.println("\nDo you have any Add ons? yes or no");
		  			add = scan.next();
		  			
		  			if(add.equals("yes") || add.equals("Yes")){
		  			System.out.println("\nWhat do you want to order on Add Ons R1,R2? ");
		  			order = scan.next();
		  			
		  			System.out.println("\nAdd Ons									Quantity");
		  			if(order.equals("R1") || order.equals("r1")){
		  			System.out.print("R1									   ");
		  				qtyR1 = scan.nextInt();
		  				}
		  				else if(order.equals("R2") || order.equals("r2")){
		  			System.out.print("R2									   ");
		  				qtyR2 = scan.nextInt();
		  				}
		  				} 
		  			else {
		  				resultC1 = c1 * qtyC1;
	  					resultC2 = c2 * qtyC2;
	  					resultC3 = c3 * qtyC3;
	  					
	  					System.out.println("\n---------------------------------------------------------------------------------");
	  					
	  					System.out.println("\nSummary");
			  			System.out.println("C1									Php "+resultC1);
			  			System.out.println("C2									Php "+resultC2);
			  			System.out.println("C3									Php "+resultC3);
			  			System.out.println("R1									Php "+resultR1);
			  			System.out.println("R2									Php "+resultR2);
			  			System.out.println();
		  			}
		  				
		  			// end of asking the user order
		  			
		  			System.out.println("\nType to yes to Continue or done to Finish ");
		  			type = scan.next(); 
		  			
		  			if(type.equals("yes") && type.equals("Yes")){
		  			// computing the item individually 
		  					resultC1 = c1 * qtyC1;
		  					resultC2 = c2 * qtyC2;
		  					resultC3 = c3 * qtyC3;
		  					resultR1= r1 * qtyR1;
		  					resultR2= r2 * qtyR2;
		  			
		  			// print the total of each item
		  					System.out.println("\n---------------------------------------------------------------------------------");
		  					
		  					System.out.println("\nSummary");
				  			System.out.println("C1									Php "+resultC1);
				  			System.out.println("C2									Php "+resultC2);
				  			System.out.println("C3									Php "+resultC3);
				  			System.out.println("R1									Php "+resultR1);
				  			System.out.println("R2									Php "+resultR2);
		  			}
		  			else {
		  				resultC1 = c1 * qtyC1;
	  					resultC2 = c2 * qtyC2;
	  					resultC3 = c3 * qtyC3;
	  					resultR1= r1 * qtyR1;
	  					resultR2= r2 * qtyR2;
	  			
	  			// print the total of each item
	  					System.out.println("\nSummary");
			  			System.out.println("C1									Php "+resultC1);
			  			System.out.println("C2									Php "+resultC2);
			  			System.out.println("C3									Php "+resultC3);
			  			System.out.println("R1									Php "+resultR1);
			  			System.out.println("R2									Php "+resultR2);
		  			}
		  			System.out.println("\n---------------------------------------------------------------------------------");
		  			}
		  			
		  			
		  			while (!type.equals("done") && !type.equals("Done") || add.equals("no") && add.equals("No"));
		  			
		  			// total adding all in Php 
		  					totalPhp = resultC1 + resultC2 + resultC3 + resultR1 + resultR2;
		  			// total in dollar 
		  					totalDollar = totalPhp / 55.79;
		  			
		  			// print/display the total Php and dollar
		  			System.out.println("Total									Php "+String.format("%,.2f",totalPhp));
		  			System.out.println("Total									$ "+String.format("%,.2f",totalDollar));
		  			scan.close();
		  			
	}

}

