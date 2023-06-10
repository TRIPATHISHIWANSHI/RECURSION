//7Check Palindrome String
package recursion;
import java.util.Scanner;
public class Palindrome 
{
	static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e)    // If there is only one character 
            return true;  
        // If first and last characters do not match 
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false;   
        // If there are multiple characters, check if 
        // middle substring is also palindrome or not. 
        if (s < e + 1) 
            return checkPalindrome(str, s + 1, e - 1);   
        return true; 
    }   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING:");
		String s=sc.nextLine();
		boolean x=checkPalindrome(s,0,s.length()-1)?true:false;
		if (x==true)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}

}
