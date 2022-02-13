package eve1;
import java.util.Scanner;
public class quotrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of dividend:");
        int div = scan.nextInt();
        
        System.out.println("Enter the value for divisor:");
        int dis = scan.nextInt();
        
        
        
        int qout = div/dis;
        int rem = div%dis;
        
        System.out.println("Quotient =" +qout);
        System.out.println("Remainder =" +rem);
        
	}

}
