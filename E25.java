package mooc.fiw2;
import java.util.Scanner;
public class E25 {
	public static void main(String[] args) {
		int sum=0;
		int read;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type the first number: ");
		read = scanner.nextInt();
		sum +=read;
		System.out.print("Type the second number: ");
		read = scanner.nextInt();
		sum +=read;
		System.out.print("Type the third number: ");
		read = scanner.nextInt();
		sum +=read;
		
		System.err.println("Sum: " +sum);
	}
}
