package recursion;

public class ArmstrongNumberRecursive {
    public static boolean isArmstrong(int number) {
        int numDigits = countDigits(number);
        int sum = calculateSumOfPowers(number, numDigits);
        
        return number == sum;
    }
    
    private static int countDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + countDigits(number / 10);
        }
    }
    
    private static int calculateSumOfPowers(int number, int numDigits) {
        if (number == 0) {
            return 0;
        }
        
        int digit = number % 10;
        int poweredDigit = (int) Math.pow(digit, numDigits);
        
        return poweredDigit + calculateSumOfPowers(number / 10, numDigits);
    }
    
    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
