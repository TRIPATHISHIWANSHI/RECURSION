//3. Sum of N Natural Numbers
package recursion;

public class sum_of_natural_numbers 
{
	static void sum(int start,int end,int result) {
		
		if(start==end) {
			result+=start;
			System.out.println(result);
			return;
		}
		result+=start;
		sum(start+1,end,result);
	}
	static int sumOfNumber(int start,int end) {
		if(start==end) {
			return start;
		}
		return start+sumOfNumber(start+1,end);
		
		
		
	}
	public static void main(String[] args) {
		sum(1,10,0);
		System.out.println(sumOfNumber(1,15));
	}

}
