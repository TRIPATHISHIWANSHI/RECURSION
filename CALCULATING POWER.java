package recursion;

public class power 
{
	public static double calculatePower(double base, int power) {
        if (power == 0) {
            return 1;  
        } else if (power < 0) {
            return 1 / calculatePower(base, -power);  
        } else {
            return base * calculatePower(base, power - 1);
        }
    }
	public static void main(String[] args) {
		System.out.println(calculatePower(4,3));
		
	}

}
