package eve1;
import java.util.Scanner;
public class arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int [] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elements: ");
		for(int i=0; i<10; i++) {
			array[i] = s.nextInt();
		}
        for(int num : array) {
        	sum = sum+num;
        }
        System.out.println("The Sum of the array elements is: " +sum);
	}

}
