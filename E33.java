package mooc.fiw2;
//the sum between two numbers

import java.util.Scanner;
public class E33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		
		System.out.print("First : ");
		int first = scanner.nextInt();
		
		System.out.print("Last : ");
		int last = scanner.nextInt();
					  
			int num = first;
		    while(num<=last){
		        sum=sum+num;
		        ++num;
		    }
		    System.out.println("Sum is " + sum);
		    }
	}
