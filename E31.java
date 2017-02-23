package mooc.fiw2;
//upper and lower limit
import java.util.Scanner;
public class E31 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);	
		
		int first, last;
		System.out.print("First: ");
		first = scanner.nextInt();
		System.out.print("Last: ");
		last = scanner.nextInt();
		
		if(first>last){
			System.err.println("error");			
		}
		
		while(first<=last){
			System.out.println(first);
			first++;
		}
			
		}
}

