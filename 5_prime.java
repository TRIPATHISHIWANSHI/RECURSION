//5. Check the Given Number is Prime or Not?
package recursion;
//by stack falling return type
public class prime {
	//	1. void return type - during stack building
	public static void primeCheck1(int num, int i) {
		if(i==num) {
			System.out.println(num+" is Prime");
			return;
		}
		if(num%i==0) {
			System.out.println(num+" is not prime");
			return;
		}
		primeCheck1(num,i+1);
	}
//	2. String return type - during stack falling
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
		primeCheck1(46, 2);
	}
    
}
