package eve1;
import java.util.Scanner;

public class areasquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the side of the Square:");
		double side = s.nextDouble();
		
		double area = side*side;
		System.out.println("The Area of the given Square is:" +area);
		

	}

}
