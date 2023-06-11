//2. Count Zero in a Given Number
//Num = 102030
//Count 0 - 3
package recursion;

public class count_zero {

	//	1. void return type - during stack building
	public static void no_of_zero1(int num, int count) {
		if(num == 0) {
			System.out.println("Count of zeroes : "+count);
			return;
		}
		if(num%10 == 0)count ++;
		no_of_zero1(num/10,count);
	}
//	2. int return type - during stack falling
	static int no_of_zero2(int num) {
		
		if(num==0) {
			return 0;
		}
		if(num%10==0) {
			return 1+no_of_zero2(num/10);
		}
		return no_of_zero2(num/10);
	}

	public static void main(String[] args) 
	{
		no_of_zero1(10040);
		System.out.println(no_of_zero2(10040));
	
	}

}
