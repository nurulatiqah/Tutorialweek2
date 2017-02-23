package mooc.fiw2;

import java.util.Scanner;
public class E26 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter numbers: ");
		
		while (true) {
			//int read = Integer.parseInt(scanner.nextLine());
		    int read = scanner.nextInt();
		    if (read == 0) {
		        break;
		    }

		    // DO SOMETHING HERE
		    sum = sum +read;
		    System.out.println("Sum now: " + sum);
		}

		System.out.println("\nSum in the end: " + sum);
	}
}