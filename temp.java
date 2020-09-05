package temp;

import java.util.Scanner;
public class temp {

	public static void main(String[] args) {
		
		// menu 
		int option;
		do {
			System.out.println("Please select an option:");
			System.out.println("[1] Convert from Celsius to Farenheit");
			System.out.println("[2] Convert from Farenheit to Celsius");
			System.out.println("[3] Quit");
			
		// user input
		Scanner select = new Scanner(System.in);
			option = select.nextInt();
		
		// continuous loop
			if(option == 1) {
				celsConverter();
			}
		
			else if(option == 2) {
				farenConverter();
			}
			
			else if(option == 3) {
				break;
			}
		
		
			else {
				System.out.println("Error. Please select an option from 1-3.");
			}
		
		} while (option != 3);
		
		System.out.println("Goodbye!");
	}
		
		
	// converts a temperature in Celsius to Farenheit
	static void celsConverter() {
		Scanner optionOne = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius: ");
		double cels = optionOne.nextDouble();
		double celsConverted;
		celsConverted = ((cels * 9) / 5) + 32;
		System.out.println("Temperature in farenheit: ");
		System.out.println(Math.round(celsConverted));
	}
	
	// converts a temperature in Farenheit to Celsius
	static void farenConverter() {
		Scanner optionTwo = new Scanner(System.in);
		System.out.println("Enter a temperature in Farenheit: ");
		double faren = optionTwo.nextDouble();
		double farenConverted;
		farenConverted = (5 * (faren - 32)) / 9;
		System.out.println("Temperature in celsius: ");
		System.out.println(Math.round(farenConverted));	
	}

	

}
