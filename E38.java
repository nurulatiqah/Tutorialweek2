package mooc.fiw2;

import java.util.Scanner;
public class E38 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many? ");
		int num = scanner.nextInt();
		for(int i = 1; i<=num; i++){
	    printText();
		}
	}

	
	public static void printText() {
		
	    System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
		    
}