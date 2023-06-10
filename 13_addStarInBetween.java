package recursion;
//13.Given a String find the adjacent element if it is same as the previous element so add the star in between
//e.g "aabbcc"
//output a*ab*bc*c
public class addStarInBetween 
{
	 public static String replaceAdjacentDuplicates(String str) {
	        // Base case: empty string or single character
	        if (str.length() <= 1) {
	            return str;
	        }

	        // Compare the first character with the second character
	        if (str.charAt(0) == str.charAt(1)) {
	            // Replace the second character with "#"
	            return str.charAt(0) + "*" + replaceAdjacentDuplicates(str.substring(1));
	        } else {
	            // Keep the first character and recursively process the remaining substring
	            return str.charAt(0) + replaceAdjacentDuplicates(str.substring(1));
	        }
	    }
	public static void main(String[] args) {
		String s1="aaabbbccc";
		System.out.println(replaceAdjacentDuplicates(s1));
		String s2="aabbcc";
		System.out.println(replaceAdjacentDuplicates(s2));
		
	}

}
