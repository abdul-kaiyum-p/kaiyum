package eve1;
import java.util.Scanner;
public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int rev=0;
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		num = s.nextInt();
		
		while(num!=0)
		{
			rev = rev*10;
			rev = rev+num %10;
			num = num/10;
		}
		System.out.println("Reverse of Input numer is:" +rev);

	}

}
