package eve1;
import java.util.Scanner;
public class floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, num=1, counter, j;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyds's triangles");
		rows = input.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("*********");
		for( counter = 1; counter<=rows; counter++)
		{
			for(j=1; j<=counter; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		

	}

}
