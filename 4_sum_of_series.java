package recursion;
//4. 1/1^1 + 2 / 2 ^2 + 3 / 3^3 
public class sum_of_series 
{
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
		System.out.println(sumOfSeries(1,3,0));
		

	}

}
