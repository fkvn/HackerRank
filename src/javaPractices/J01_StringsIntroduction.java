package javaPractices;

import java.util.Scanner;


/**
 * Given two strings of lower-case English letters,  and , perform the following operations:
   
   		1. Sum the lengths of A and B.
		2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
		3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
		
	Input Format
		The first line contains a string A. 
		The second line contains another string B. 
		The strings are comprised of only lower-case English letters.
	
	Output Format
		There are three lines of output: 
			For the first line, sum the lengths of A and B. 
			For the second line, write Yes if A is lexicographically greater than B otherwise print No instead. 
			For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
 */

public class J01_StringsIntroduction {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());
        boolean aGreaterB = false;
        
        for (int i = 0; i < A.length() && i < B.length(); i++) {
        	if ((int)(A.charAt(i)) > (int)(B.charAt(i)))
        	{
        		aGreaterB = true;
        		break;
        	}
        	else if ((int)(A.charAt(i)) < (int)(B.charAt(i)))
        	{
        		aGreaterB = false;
        		break;
        	}
        }
        
        if (aGreaterB)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        
        sc.close();
        

	}

}
