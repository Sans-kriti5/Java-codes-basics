import java.util.*;

class NumberPalin

{
    private int num;

    public void SetData(int num) {
        this.num = num;
    }

    public boolean isPalindrome() {
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            int ext = temp % 10;
            rev = rev * 10 + ext;
            temp /= 10;
        }
        return (rev == num); // Check if the sum equals the original number
    }

}

public class Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an interger:");
        int number = sc.nextInt();
        NumberPalin n = new NumberPalin();
        n.SetData(number);
        boolean res = n.isPalindrome();
        System.out.println("Is Palindrome: " + res);
    }
}