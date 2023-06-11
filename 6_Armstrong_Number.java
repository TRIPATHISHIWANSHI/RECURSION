import java.util.Scanner;

public class Number_ArmstrongCheck {

//	1. void return type - during stack building
	public static void armstrongCheck1(int num, int digits, int res) {
		if(num == 0) {
			System.out.println(num==res?"Armstrong Number":"Not an Armstrong number");
			return;
		}
		res-= Math.pow(num%10, digits);	
		armstrongCheck1(num/10, digits, res);
	}
//	2. boolean return type - during stack falling
	static boolean flag = false;
	public static boolean armstrongCheck2(int num, int digits, int res) {
		if(num == 0) {
			if(res==0)flag = true;
			return flag;
		}
		res -= (int)Math.pow(num%10,digits);
		armstrongCheck2(num/10, digits, res);
		return  flag;
	}
  
	public static int digits(int num) {
		if(num == 0) {
			return 0;
		}
		int dig = digits(num/10);
		dig+= 1;
		return dig;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked - ");
		int num = sc.nextInt();
		int dig = digits(num);
		armstrongCheck1(num,dig,num);
		System.out.println(armstrongCheck2(num, dig, num)?"Armstrong Number":"Not an Armstrong number");
		sc.close();
	}

}
