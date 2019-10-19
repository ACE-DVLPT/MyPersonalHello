import java.util.Scanner;

public class MyPersonalHello {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease inter your name\n");
		String user = scan.nextLine();
		System.out.println("\n------\n\nHello " + user + " !\n\n------\n");

	}

}

