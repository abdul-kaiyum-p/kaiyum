package eve1;
import java.util.Scanner;
public class oddeven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		if(num%2==0)
			System.out.println("THE NUMBER IS EVEN NUMBER..");
		else
			System.out.println("THE NUMBER IS ODD NUMBER..");
			
		

	}

}
