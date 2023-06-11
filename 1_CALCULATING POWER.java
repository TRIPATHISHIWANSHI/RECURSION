//Power of a Number
//example-2^5
package recursion;

public class power 
{
	//	1. void return type - during stack building
	public static void calculatePower1(int num, int pow, int res) {
		if(pow == 0) {
			System.out.println("Calculated Power is : "+res);
			return;
		}
		res*=num;
		calculatePower1(num, pow-1, res);
	}
//	2. int return type - during stack falling
	public static double calculatePower2(double base, int power) {
        if (power == 0) {
            return 1;  
        } else if (power < 0) {
            return 1 / calculatePower2(base, -power);  
        } else {
            return base * calculatePower2(base, power - 1);
        }
    }
	
	public static void main(String[] args) {
		System.out.println(calculatePower2(2,5));
		calculatePower1(2,5)
	}

}
