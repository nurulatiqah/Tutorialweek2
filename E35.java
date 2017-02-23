package mooc.fiw2;
import java.util.Scanner;
public class E35 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int number = 2;
		System.out.print("Type a number: " );
		int power = scanner.nextInt();
		
		int result = (int)Math.pow(number, power);
		
		System.out.println("The result is " +result);
	}

}
