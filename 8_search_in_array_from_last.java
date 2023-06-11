//8.Array Search the Element From the Last. (lastIndexOf)
package recursion;
import java.util.*;
public class search_from_last {

	//	1. void return type - during stack building
	public static void indexfromLast1(int[] arr, int index, int ele, int res) {
		if(index == arr.length) {
			System.out.println((res>=0)?"Element found at index :"+res : "Element not found");
			return;
		}
		if(arr[index] == ele)res = index;
		indexfromLast1(arr, index+1, ele, res);
	}
//	2. int return type - during stack falling
	static int search(int a[],int num,int start) {
		if(start<0) {
			return -1;
		}
		if(a[start]==num) {
			return 1;
		}
		return search(a,num,start-1);
		
	}
	public static void main(String[] args) {
		int [] array= {1,2,3,4,5,6,7,8,9,10};
		int res=search(array,1,0);
		if(res==1) {
			System.out.println("PRESENT");
		}
		else {
			System.out.println("NOT PRESENT");
		}

	}

}
