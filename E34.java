package mooc.fiw2;
import java.util.Scanner;
public class E34 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int mul=1;
		System.out.print("Type a number : ");
		int n = scanner.nextInt();
					   
		    for(int i=1;i <= n; i++){
		        mul*=i;
		    }
		    System.err.println("Factorial: " + mul);
		    }
	}

