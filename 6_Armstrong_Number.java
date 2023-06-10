//6. Check the Given Number is Armstrong or Not?

// 153

// 1^3 + 5^3 + 3^3 = 153



public class ArmstrongNumberRecursive {
    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number, countDigits(number)))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    // Recursive function to check if a number is Armstrong or not
    public static boolean isArmstrong(int number, int numDigits) {
        if (number == 0)
            return true;
        int digit = number % 10;
        int power = (int) Math.pow(digit, numDigits);
        return power + isArmstrong(number / 10, numDigits);
    }

    // Recursive function to count the number of digits in a number
    public static int countDigits(int number) {
        if (number == 0)
            return 0;
        return 1 + countDigits(number / 10);
    }
}
