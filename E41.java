package mooc.fiw2;

import java.util.Random;
import java.util.Scanner;

public class E41 {

public static void  main(String[] args){
		guess();
		
	}
		public static void guess(){
			
			Random rand = new Random();
			int r = rand.nextInt(10);
			int count = 1;
		
		
		while(true){	//while
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Guess a number: ");
			int num = scanner.nextInt();
			
			if(num>=11){
				break;
			}
			
			if(num==r){
			System.out.println("Congratulations, your guess is correct!");
			break;
		}	
			if(num < r){
				System.out.println("The number is greater, guesses made: " +count);
				count++; //if want the number of guesses
			}
			
			if(num>r){
				System.out.println("The number is lesser, guesses made: " +count);
				count++;
			}
			
		//System.out.print("Guess a number: ");
		//num = scanner.nextInt();
	} 
	}//break end while
}

