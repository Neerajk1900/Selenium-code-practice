package Program_Practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		long factorial =1;
		
		for(int i=1; i<=num;i++)
		{
			factorial = factorial * i ;
		}

		System.out.println(factorial);
	}

}
