package eve1;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first = 2.50f, second = 4.50f;
		
		System.out.println("--Before Swapping--");
		System.out.println("First numer = " + first);
		System.out.println("Second number = " + second);
		
		float temp = first;
		first = second;
		second = temp;
		
		System.out.println("--After Swapping--");
		System.out.println("First Number = " + first);
		System.out.println("Second Number = " + second);

	}

}
