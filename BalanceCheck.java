import java.util.*;

class Test {
    private int[] num;

    public void setData(int[] num) {
        this.num = num;
    }

    public boolean isBalanced() {
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                if (num[i] % 2 != 0) {
                    return false; // Even index should have even number
                }
            } else {
                if (num[i] % 2 != 1) {
                    return false; // Odd index should have odd number
                }
            }
        }
        return true;
    }
}

public class BalanceCheck {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        Test t = new Test();
        t.setData(num);

        boolean res = t.isBalanced();

        if (res == true) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}

// The code checks if the array is balanced or not.
// An array is considered balanced if all even indexed elements are even and all
// odd indexed elements are odd.