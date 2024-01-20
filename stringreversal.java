package practice;

import java.util.Scanner;

public class stringreversal {
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string - ");
		String a=scan.nextLine();
		String b=reverseString(a);
		System.out.println("original string - "+a);
		System.out.println("reverse string - "+b);
	}
	static String reverseString(String input)
	{
		StringBuilder rev=new StringBuilder();
		for (int i=input.length()-1; i>=0; i--)
		{
			rev.append(input.charAt(i));
		}
		return rev.toString();
	}

}
