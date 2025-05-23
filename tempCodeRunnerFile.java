import java.util.*;

class Number {
    private int num;

    public void setNumber(int num) {
        this.num = num;
    }

    public int getOddNumDigitCount() {
        int count = 0;
        int temp = num; // Use a temp variable to avoid modifying 'num'
        while (temp != 0) {
            int ext = temp % 10;
            if (ext % 2 != 0) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    public int getOddNumDigitSum() {
        int sum = 0;
        int temp = num; // Use a temp variable again
        while (temp != 0) {
            int ext = temp % 10;
            if (ext % 2 != 0) {
                sum += ext;
            }
            temp = temp / 10;
        }
        return sum;
    }

    public int getEvenNumDigitCount() {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            int ext = temp % 10;
            if (ext % 2 == 0) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    public int getEvenNumDigitSum() {
        int sum = 0;
        int temp = num; // Use a temp variable again
        while (temp != 0) {
            int ext = temp % 10;
            if (ext % 2 == 0) {
                sum += ext;
            }
            temp = temp / 10;
        }
        return sum;
    }

    public int getDigitSquareSum() {
        int sum = 0;
        int temp = num; // Use a temp variable again
        while (temp != 0) {
            int ext = temp % 10;
            {
                sum += (ext ^ 2);
            }
            temp = temp / 10;
        }
        return sum;
    }

    public int getDigitSum() {
        int sum = 0;
        int temp = num; // Use a temp variable again
        while (temp != 0) {
            int ext = temp % 10;
            {
                sum += ext;
            }
            temp = temp / 10;
        }
        return sum;
    }
}

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        Number n = new Number();
        n.setNumber(num);
        int Ecount = n.getEvenNumDigitCount();
        int Esum = n.getEvenNumDigitSum();
        int count = n.getOddNumDigitCount();
        int sum = n.getOddNumDigitSum();
        int digitSum = n.getDigitSum(); // Get the sum of digits
        System.out.println("Digit Sum: " + digitSum); // Print the sum of digits
        int squareSum = n.getDigitSquareSum(); // Get the square sum of digits
        System.out.println("Digit Square Sum: " + squareSum); // Print the square sum of digits

        System.out.println("Odd Number Count: " + count);
        System.out.println(" Odd Number Sum: " + sum);
        System.out.println("Even Number Count: " + Ecount);
        System.out.println("Even Number Sum: " + Esum);
    }
}
