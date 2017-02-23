package mooc.fiw2;
import java.util.Scanner;
public class E32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		System.out.print("Until what number? : ");
		int n = scanner.nextInt();
					   
		    for(int i=0;i <= n; i++){
		        sum=sum+i;
		    }
		    System.out.println("Sum is " + sum);
		    }
	}


