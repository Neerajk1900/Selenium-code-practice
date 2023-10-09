package Program_Practice;

public class Longest_string {
	
	public static int main(String args[])
	{
	//final int lcsubstr(String "str1",String "str2)
	
		String str1= "abcab";
		String str2= "aaabbcabca";

		int ans = 0;

		for (int i = 0; i < str1.length(); i++) 
		{
	         for (int j = 0; j < str2.length(); j++) {
			int k = 0;
			while ((i + k) < str1.length() && (j + k) < str2.length() 
					&& str1.charAt(i + k) == str2.charAt(j + k)) 
			{
				k = k + 1;
			}

			ans = Math.max(ans, k);
		   }
		}
	      return ans;
	  }}

