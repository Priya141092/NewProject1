package Strings_Know;

public class Palindrome {

	public static void main(String[] args) {
		int n=454;
		int r, sum=0,temp;
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a plindrome");
		}

	}

}
