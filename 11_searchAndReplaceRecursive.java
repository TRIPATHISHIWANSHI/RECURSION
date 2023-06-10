package recursion;

import java.util.Arrays;

//11.Given an Array find the element and replace the value with given value, search and replace all occurrences.
public class replaceValues 
{
	static void searchAndReplaceRecursive(int[] arr, int searchElement, int replaceElement, int currentIndex) {
        if (currentIndex == arr.length) {
        	System.out.println(Arrays.toString(arr));
            return ;
        }

        if (arr[currentIndex] == searchElement) {
            arr[currentIndex] = replaceElement;
        }

        searchAndReplaceRecursive(arr, searchElement, replaceElement, currentIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5,0,9,2,6,7,2,2,2,2};
        int searchElement = 2;
        int replaceElement = 9;
        searchAndReplaceRecursive(arr, searchElement, replaceElement,0);
      
    }
}

