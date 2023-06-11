//7Check Palindrome String
package recursion;
import java.util.Scanner;
public class Palindrome 
{
	//	1. void return type - during stack building
	public static void palindromeCheck1(String str, int index) {
		if(index == str.length()/2+1) {
			System.out.println(str+ " : Palindrome");
			return;
		}
		if(Character.compare(str.charAt(index), str.charAt(str.length()-1-index)) != 0){
			System.out.println(str + " : Not palindrome");
			return;
		}
		palindromeCheck1(str,index+1);
	}
//	2. String return type - during stack falling
	
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
		palindromeCheck1("abbawwa",0);
		System.out.println("ENTER A STRING:");
		String s=sc.nextLine();
		boolean x=checkPalindrome(s,0,s.length()-1)?true:false;
		if (x==true)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}

}
