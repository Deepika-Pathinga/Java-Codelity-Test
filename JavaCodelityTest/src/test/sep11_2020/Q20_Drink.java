package test.sep11_2020;

import java.util.Scanner;

public class Q20_Drink {
	public static void main(String[] args) {		
	
		int Milk_Serving=1;
		int Water_Serving=2;
		
		Scanner s = new Scanner (System.in);
		
		for(;;) {
			System.out.println("Please enter your drink type: Milk or Water or quit");
			String drinkType = s.next();
			drinkType = drinkType.toUpperCase();
			
			
			if (drinkType.equalsIgnoreCase("quit"))
			{
				System.out.println("program QUIT");
				break;
			}
			else {
			
				switch (drinkType) {
					case "MILK":
						if (Milk_Serving>=1) {
							System.out.println("1 serving of milk is available");
							Milk_Serving= Milk_Serving-1;
						} 
						else {
							System.out.println("Milk is not available now. Sorry!");
						}
					break;
					
					case "WATER":
						if (Water_Serving>=1) {
							System.out.println("1 serving of water is available");
							Water_Serving= Water_Serving-1;
						} 
						else {
							System.out.println("Water is not available now. Sorry!");
						}
					break;
					
					default:
						System.out.println("Enter Milk or Water or Quit");
					break;
			
				}
			}
		}
		s.close();
	}
}

