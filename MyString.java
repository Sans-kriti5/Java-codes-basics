import java.util.*;

class Demo {
    private String str;

    public void SetString(String str) {
        this.str = str;
    }

    public Boolean isPalindrome() {
        String rev = " "; // Initialize rev
        for (int i = str.length() - 1; i >= 0; i--) {
            char ext = str.charAt(i);
            rev = rev + ext;
        }
        // Fix: use equalsIgnoreCase() (not equalIgnoreCase)
        return str.equalsIgnoreCase(rev);
    }
}

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s1 = sc.nextLine();
        Demo s = new Demo();
        s.SetString(s1);
        Boolean res = s.isPalindrome();
        if (res == true) {
            System.out.println("It's a Palindrome.");
        } else {
            System.out.println("It's not a Palindrome.");
        }
        sc.close(); // Best practice: close Scanner
    }
}