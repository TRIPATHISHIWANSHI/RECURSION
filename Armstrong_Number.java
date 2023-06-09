//by stack falling return type
public class Armstrong_Number {
	public static int arms(int num) {
		if(num==0) {
			return 0;
		}
		int res=arms(num/10);
		res=(int)(res+Math.pow(num%10, 3));
		return res;
	}
	public static void main(String[] args) {
		int num =153;
		System.out.println(num==arms(num)?"Armstrong":"not an Armstrong");
		
	}

}
