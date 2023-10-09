package Program_Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
	/*	String str= "MADAM";
		String org_str=str;
		
		String rev = "";
		
		StringBuffer sb = new StringBuffer(str);
		rev= (rev + sb.reverse());
		System.out.println(rev);  */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.next();
		String org_str=str;
		
		String rev = "";
        int length= str.length();
        
        for (int i=0;  i<length; i++)
        {
        	rev= rev + str.charAt(i);
        }

		if (org_str.equalsIgnoreCase(rev))
		{
		System.out.println("String is Palindrome");	
		} else
		{
			System.out.println("String is not Palindrome");	

		}

	}

}
