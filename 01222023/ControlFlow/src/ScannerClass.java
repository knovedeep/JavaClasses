import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// AsciiChars.printNumbers();
		// AsciiChars.printUpperCase();
		// AsciiChars.printLowerCase();

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String nameValue = (input.nextLine());
		System.out.printf("Hello %s \n", nameValue);
		System.out.println("Do you wish to continue to the game?");
		boolean condition = true;
		String answer = input.nextLine();
		if (answer.charAt(0) == 'n') {
			System.out.println("Please return later to complete the questions");
			condition = false;
			while (condition == false) {
				System.out.println("Do you wish to continue to the game now?");
				answer = input.nextLine();
				if (answer.charAt(0) == 'y') {
					condition = true;
				}
			}
		} else if (answer.charAt(0) == 'y') {
			condition = true;
		}

		if (condition = true) {

			System.out.println("let's begin the game");

			System.out.println("What is the name of your favorite pet?");
			String petAnswer = (input.nextLine());
			boolean validName = true;
			if (!petAnswer.matches("[a-zA-Z]+")) {
				System.out.println("Sorry, that is not a valid name!");
				validName = false;
				while (validName = false) {
					System.out.println("Please enter a valid Pet name");
					petAnswer = input.nextLine();
					if (petAnswer.matches("[a-zA-Z]+")) {
						validName = true;
					}
				}

			} else if (petAnswer.matches("[a-zA-Z]+")) {
				validName = true;
				if (validName = true) {
					char value = petAnswer.charAt(2);
					int ascii = (int) value;
					if (ascii < 75) {
						// COMMENT OUT THE SYSTEM PRINT WHEN FINISHED
						System.out.print(ascii + "\n");
					} else {
						int ascii2 = ascii - 52;
						// COMMENT OUT THE SYSTEM PRINT WHEN FINISHED
						System.out.print(ascii2 + "\n");
					}

				}
			}
			System.out.println("What is the age of your favorite pet");
			int petAge=input.nextInt();
			boolean petAgeValid = true;
			if (petAge <0 || petAge>75) {
				petAgeValid = false;
				System.out.println("Thats not possible now is it?? Please make sure the age is within 0 and 75");
			}
			if (petAge >0 || petAge<75) {
				petAgeValid = true;
			}
			for(petAgeValid=false;;) {
				petAge = input.nextInt();
				if (petAge >0 || petAge<75) {
					petAgeValid = true;
				}
				else if (petAgeValid = true) {
					System.out.print(petAge);
			}
		
			
				
				
		}
		}
	}
}





		/*
						System.out.println("What is the age of your favorite pet");
						if (!input.hasNext("[a-zA-Z]+")) {
							String petAge = input.nextLine();
							System.out.println(petAge);
						} else {

							System.out.println("Sorry, that is not a valid name!");
							continue;
						}
					}

					
					 * System.out.println("what is your lucky number?");
					 * 
					 * System.out.println("Do you have a favorite quarterback?");
					 * 
					 * System.out.println("what is the two-digit model year of your car?");
					 * 
					 * System.out.
					 * println("What is the first name of your favorite actor or actress?");
					 * 
					 * System.out.println("Enter a random number bwtween 1 and 50");
					 */
				

		
	


