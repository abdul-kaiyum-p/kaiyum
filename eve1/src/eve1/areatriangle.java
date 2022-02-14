package eve1;
import java.util.Scanner;
public class areatriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the width of the triangle: ");
		double base = s.nextDouble();
		
		System.out.println("Entre the heigth of the triangle: ");
		double heigth = s.nextDouble();
		
		double area = (base*heigth)/2;
		System.out.println("The Area of the triangle is: " +area);

	}

}
