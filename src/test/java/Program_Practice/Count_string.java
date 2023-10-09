package Program_Practice;

import java.util.Scanner;

public class Count_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");

		Scanner sc= new Scanner(System.in);				
				String s= sc.nextLine();
				int count=1;
				
				for (int i=0; i<s.length()-1; i++)
				{
					if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '));
				   {
					count++;
				   }
				}
				
				System.out.println(count);

	}

}
