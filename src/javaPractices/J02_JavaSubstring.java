package javaPractices;

import java.util.Scanner;

/*	Given a string s and two indices start and end
 * 
 * 	Print a substring consisting of all characters 
   		in the inclusive range from start to end - 1. 
 *  You'll find the String class' substring method helpful in completing this challenge.
 *  
 *  
 *  Input Format
	The first line contains a single string denoting . 
	The second line contains two space-separated integers denoting
	 	the respective values of start and end.
	 	
 *	Constraints
 	1 <= s <= 100
 	0 <= start < end <= n
 	String  consists of English alphabetic letters only.
 	
 *	Output Format
	Print the substring in the inclusive range from  to .
	
 *	Sample Input
	Helloworld
	3 7
 *	Sample Output
 	lowo
 	
*/

// unsovled
public class J02_JavaSubstring {

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        
        String S = in.next();
        
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
        
        in.close();

	}

}
