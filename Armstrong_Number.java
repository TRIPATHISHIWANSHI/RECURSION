package recursion;

public class Armstrong_Number 
{
	static void checkArm(int num) 
	{
		int sum=0;
		int numDigits = String.valueOf(num).length();
		if(num==0) {
			return;
		}
		
		int digits=num%10;
		sum=sum+(int)Math.pow(digits, numDigits);
		checkArm(num/10);
		 if (sum == num) {
		        System.out.println(num + " IS ARMSTRONG NUMBER");
		    } else {
		        System.out.println(num + " IS NOT ARMSTRONG NUMBER");
		    }
	}
		
	
	public static void main(String[] args) 
	{
		checkArm(153);
	}

}
