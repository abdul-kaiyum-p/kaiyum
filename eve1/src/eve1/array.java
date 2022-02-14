package eve1;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {10, 20, 30, 40, 50, 60};
		int sum = 0;
		
		for(int num : array) {
			sum = sum+num;
		}
		System.out.println("Sum of array elements is: " +sum);

	}

}
