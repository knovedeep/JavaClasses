
public class AsciiChars {

	public static void printNumbers () {
		for(char value=48;value<58; value++) {
			System.out.print(value);
		}
		System.out.println(" ");
	}





public static void printLowerCase () {
	for(char value=97; value<123; value++) {
		System.out.print(value);
		
	}
	System.out.println(" ");
}





public static void printUpperCase () {
	for(char value=65; value<91; value++) {
		System.out.print(value);
		
	}
	System.out.println(" ");
}

public static void main(String[] args) {
	//
	AsciiChars.printNumbers();
	AsciiChars.printUpperCase();
	AsciiChars.printLowerCase();
}
}