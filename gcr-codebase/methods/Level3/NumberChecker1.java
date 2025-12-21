public class NumberChecker {

    // Method to find count of digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        if (n == 0) return 1;
        while (n != 0) {
        count++;
        n /= 10;
        }
        return count;
    }

    // Method to store digits of number in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        int n = number;
        while (n != 0) {
        digits[index--] = n % 10;
        n /= 10;
        }
        return digits;
    }

    // Method to check Duck Number (contains zero, not leading)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
        if (digits[i] == 0) {
        return true;
        }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
        sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
        if (d > largest) {
        secondLargest = largest;
        largest = d;
        }
        else if (d > secondLargest && d != largest) {
        secondLargest = d;
        }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
        if (d < smallest) {
        secondSmallest = smallest;
        smallest = d;
        } 
        else if (d < secondSmallest && d != smallest) {
        secondSmallest = d;
        }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        //Get an input
        int number = sc.nextInt90;;
        int[] digits = storeDigits(number);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println("\n\nDigit Count: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));
        int[] maxValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + maxValues[0]);
        System.out.println("Second Largest Digit: " + maxValues[1]);
        int[] minValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + minValues[0]);
        System.out.println("Second Smallest Digit: " + minValues[1]);
    }
}
