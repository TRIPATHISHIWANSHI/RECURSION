//5. Check the Given Number is Prime or Not?
package recursion;
//by stack falling return type
public class prime {
	public static String primenrs(int num,int temp) {
		if(temp==(int)Math.sqrt(num)) {
			return "the number is prime";
		}
		if(num%temp!=0) {
			return primenrs(num,temp+1);
		}
		else {
			return "the number is not prime";
		}
	}
	public static void main(String[] args) {
		System.out.println(primenrs(53,2));
	}
    
}
