package eve1;
import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		double len = scan.nextDouble();
		System.out.println("Enter the width of the rectangle:");
		double wid = scan.nextDouble();
		
		double area = len*wid;
		System.out.println("Area of the rectangle is:" +area);
		
				
			
		

	}

}
