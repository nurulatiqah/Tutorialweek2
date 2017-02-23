package mooc.fiw2;
import java.util.Scanner;
public class E30 {
//up to 3 number
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int a=1,b;
		System.out.print("Up to what number: ");
		b = scanner.nextInt();
		while(a<=b){
			System.err.println(a);
			a++;
		}
	}

}
