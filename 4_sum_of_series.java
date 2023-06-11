package recursion;
//4. 1/1^1 + 2 / 2 ^2 + 3 / 3^3 
public class sum_of_series 
{
	//	1. void return type - during stack building
	public static void series(int num, double res) {
		if(num == 1) {
			System.out.println("Sum of series :"+(res+1));
			return;
		}
		res += 1/Math.pow(num,num-1);
		series(num-1,res);
	}
//	2. double return type - during stack falling
	static double sumOfSeries(int start,int end,double res) {
		if(start==0) {
			return 0;
		}
		res=res+start/(Math.pow(start,start));
		if(start==end) {
			return res;
		}
		return sumOfSeries(start+1,end,res);
		
	}
	public static void main(String[] args) {
		series(7,0);
		System.out.println(sumOfSeries(1,3,0));
		

	}

}
