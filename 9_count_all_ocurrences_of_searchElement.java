//9.Count all Occurrence of Search Element 
package recursion;
public class count_all_ocurrences_of_searchElement {
	//by stack falling return type
     public static int occurence(int [] arr,int num,int index) {
    	 if(index==arr.length) {
    		 return 0;
    	 }
    	 int count=occurence(arr,num,index+1);
    		 if(arr[index]==num) {
    			 count++;
    		 }
    		 return count;
    	 }
     //by stack void return type
     public static void occurrence(int[] array, int num, int index, int count) {
    	    if (index == array.length) {
    	        System.out.println(num + " occurs " + count + " times");
    	        return;
    	    }
    	    if (array[index] == num) {
    	        count++;
    	    }
    	    occurrence(array, num, index + 1, count);
    	}
    	 public static void main(String[] args) {
    		 int arr[]= {50,20,30,40,50,10,20,60,20};
    		 System.out.println(occurence(arr,20,0));
    		 occurrence(arr,20,0,0);
    	 }
 }
