package Program_Practice;

public class Armstrong1 {

	public static void main(String[] args) {
		
		int n= 1215;
		int temp= n;
		int r ,sum =0;
		
		while(n>0)
		{
		r= n%10;
		n=n/10;
		
		sum= sum + r*r*r ;
		}
		if (temp==sum)
		{
			System.out.println("No is armstrong");  }
		else
		{
			System.out.println("No is not Armstrong");
		}
	}

}
