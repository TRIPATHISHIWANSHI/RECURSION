package recursion;

public class count_zero {

	static int no_of_zero(int num) {
		
		if(num==0) {
			return 0;
		}
		if(num%10==0) {
			return 1+no_of_zero(num/10);
		}
		return no_of_zero(num/10);
	}

	public static void main(String[] args) 
	{
		System.out.println(no_of_zero(10040));
	
	}

}
