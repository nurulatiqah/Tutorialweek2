package mooc.fiw2;

import java.util.Scanner;
public class E36 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		int num = 0;
		int sum =0;
		int num2 = num;
		int even = 0, odd = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number: ");
		num = scanner.nextInt();
		
		while(true){
			
					
			if(num>0){
				sum = num + sum;
				num2++;
					
			if(num%2==0){
				even++;
			}
			
			if(num%2==1){
				odd++;
			}
			num = scanner.nextInt();
		}//endif
						
			if(num<0){
			System.out.println("Thankyou and see you later!");
			break;
		}
		}//endwhile	
		
		System.out.println("The sum is " +sum);
		System.out.println("How many numbers: " +num2);
		double average = (double)sum / num2;
		System.out.println("Average: " +average);
		System.out.println("Even numbers: " +even);
		System.out.println("Odd numbers: " +odd);
		
	}
	}



