package AutoMobile;

import java.util.Scanner;
import java.util.Arrays;


public class CarInventory {
	

	
	//Starting of searchVehicle method
	public static void searchVehicle(String autoMake, String autoModel, String autoColor, int autoYear){
		
		String [] carType  = {"Toyota","Nissan", "Ford", "Mazda", "Opel", "Mercedes", "Dodge"};
		String [] carModel = {"Camery","Altima", "Mustang", "CX-5", "Insignia", "Benz-A", "Hornet"};
		String [] carColor = {"Silver","White", "Red", "Black", "Gray", "Gray", "Green"};
		int    [] carYear  = {2020, 2021, 2022, 2023, 2022, 2024, 2020};
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); //For user input inside the searchVehicle method.
		int i;
		boolean found = false;
		char userInput;
		char addCar;
			
		//Searching loop
		for(i = 0; i < carType.length; ++i) {
			
		 if (carType[i].equals(autoMake) && carModel[i].equals(autoModel) && carColor[i].equals(autoColor) && carYear[i] == autoYear ) {
			 found = true;
			System.out.println("The following Vehicle " + carType[i] + ", model:" + carModel[i] + ", Color: " +
					  carColor[i] + ", Year: " + carYear[i] + " Found in the inventory list" );		
			System.out.println();
			
			System.out.print("Do you want to remove the Vehcile from the inventory list: ");
			userInput = input.next().charAt(0);
			
			if(userInput =='y' || userInput == 'Y' ) {
				removeVehicle(carType[i], carModel[i], carColor[i], carYear[i]);		
			}//End of Nested IF Statement in searching loop
						
			else {System.out.print("Vehicle Found & Search is over..Good Bye");} //Else Statement inside searching loop
			break;
		 } //End of the nested IF inside for
	
		} //End of FOR-LOOP
		
		//If the information not found
		if( !found ) { System.out.println("Vehicle Not Found! .");
		System.out.println("");
		
		System.out.print("Do you want to add this Vehicle to the list: ");
		addCar = input.next().charAt(0);
		
		   if (addCar == 'y' || addCar == 'Y') {
			   
			   addVehicle(autoMake, autoModel, autoColor, autoYear);
			   
		   } //IF-Statment for Adding Vehicle 
		   
		   
		   else {System.out.print(" You Selcted NO...Good Bye");}
          
		} //End of IF
		   
	} //End of searchVehicle method
	
//---------------------------------------------------------------------------------------------------------------------------	
	
	
	
	
	
//Start addVehicle method	
public static void addVehicle(String auto, String model, String color, int year) {
	
} //End of addVehicle method 
	
//---------------------------------------------------------------------------------------------------------------------------	
	

	//Start removeVehicle method
	
	public static void removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
	int i, j;
	String [] carType = {"Toyota","Nissan", "Ford", "Mazda", "Opel", "Mercedes", "Dodge"};
	String [] carModel = {"Camery","Altima", "Mustang", "CX-5", "Insignia", "Benz-A", "Hornet"};
	String [] carColor = {"Silver","White", "Red", "Black", "Gray", "Gray", "Green"};
	int    [] carYear = {2020, 2021, 2022, 2023, 2022, 2024, 2020};
		
		for ( i = 0; i < carType.length && i < carModel.length &&  i < carColor.length &&  i <carYear.length; ++i) {
	        if(carType[i].equals(autoMake) && carModel[i].equals(autoModel) && carColor[i].equals(autoColor) && carYear[i] == autoYear){        	
	            for(j = i; j < carType.length-1 && j < carModel.length -1 &&  j < carColor.length - 1 &&  j <carYear.length - 1; ++j) {
	                carType  [j] = carType  [j + 1];
	                carModel [j] = carModel [j + 1];
	                carColor [j] = carColor [j + 1];
	                carYear  [j] = carYear  [j + 1];
	            }
	        }
	    } //End of FOR-LOOP Remove 
		
		
	    System.out.println();
	    System.out.println("After removing, the new list is: ");
	    System.out.println();
	    for(i = 0; i < carType.length - 1 && i < carModel.length -1 &&  i < carColor.length - 1 &&  i <carYear.length - 1;  ++i){
	      
	    	
		    System.out.print(carType[i] + ", ");
	        
	        System.out.print(carModel[i] + ", ");
	       
	        System.out.print(carColor[i] + ", ");
	       
	        System.out.println(carYear[i] + ". ");	
	        System.out.println("-------------------------------");
	    } //Last for loop		
		
	} //End of removeVehicle method 
	
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	
	
	
	
//Starting of main method
	
		public static void main(String [] arg) {
		
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);	
			String type;
			String model;
			String color;
			int year;
			
			System.out.println("Enter the information popped in the prompt to find if the "
					+ "car available in the Inventory List ");
			System.out.println();
			
			System.out.print("Enter the car type: ");
			type = input.next();
			System.out.println();
			
			System.out.print("Enter the car model: ");
			model = input.next();
			System.out.println();
			
			System.out.print("Enter the car Color: ");
			color = input.next();
			System.out.println();
			
			System.out.print("Enter the car Year: ");
			year = input.nextInt();
			System.out.println();
			
			searchVehicle(type, model, color, year); //invoking AddRemoveVehicle () method
		}//End  of main method 
			
		

} //End of Class
