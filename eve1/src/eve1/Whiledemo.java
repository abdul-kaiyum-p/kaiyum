package eve1;
import java.util.Scanner;
public class Whiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number which is below 10: ");
		num = scan.nextInt();
		
		while(num <= 10) {
			sum = sum+num;
			num++;
		}
		System.out.format("Sum of the numbers from the while loop is: %d", sum);

	}


}
