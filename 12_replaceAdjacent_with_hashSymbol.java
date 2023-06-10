package recursion;

public class replaceAdjacent_with_hashSymbol {
    public static String replaceAdjacentDuplicates(String str) {
        // Base case: empty string or single character
        if (str.length() <= 1) {
            return str;
        }

        // Compare the first character with the second character
        if (str.charAt(0) == str.charAt(1)) {
            // Replace the second character with "#"
            return str.charAt(0) + "#" + replaceAdjacentDuplicates(str.substring(2));
        } else {
            // Keep the first character and recursively process the remaining substring
            return str.charAt(0) + replaceAdjacentDuplicates(str.substring(1));
        }
    }


	
	public static void main(String[] args) {
		String s="aabbcc";
		System.out.println(replaceAdjacentDuplicates(s));

	}

}
