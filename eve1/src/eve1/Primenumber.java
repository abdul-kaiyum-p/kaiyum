package eve1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int num = 0;
		String primenumbers = "  ";
		
		for(i=1; i<=100; i++)
		{
			int counter = 0;
			for(num=1; num>=1; num-- )
			{
				if(i%num==0) {
					counter = counter+1;
				}
			}
			if(counter == 2) {
				primenumbers = primenumbers + i;
			}
		}
        System.out.println("Prime numbers from 1 to 100 are: "+ primenumbers);
       
	}

}
