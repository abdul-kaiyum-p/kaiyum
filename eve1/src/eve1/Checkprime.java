package eve1;
import java.util.Scanner;
public class Checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isprime = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		s.close();
		for(int i=2; i<=num/2; i++) {
			temp=num%i;
			if(temp==0) {
				isprime=false;
				break;
			}
		}
		if(isprime)
			System.out.println(num+ " is a prime number");
		else
			System.out.println(num+ " is not a prime number...");
		
		

	}

}
