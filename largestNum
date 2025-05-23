import java.util.*;

class Number {
    private int[] num;

    public Number() {
        num = new int[10];
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
    }

    public int getLargest() {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

}

public class largest {
    public static void main(String[] args) {
        Number n = new Number();
        n.inputData();
        int largest = n.getLargest();
        System.out.println("Largest number is: " + largest);
    }
}
