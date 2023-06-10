//8.Array Search the Element From the Last. (lastIndexOf)
package recursion;
import java.util.*;
public class search_from_last {

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
