import java.util.*;



class MyString {
    private String str;

    public void setString(String str) {
        this.str = str;
    }

    public boolean isPalindrome() {
        String rev = "";
        String original = str.toLowerCase();  // Convert to lowercase for fair comparison
        for (int i = original.length() - 1; i >= 0; i--) {
            rev += original.charAt(i);
        }
        return original.equals(rev);
    }
}

public class MyStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s1 = sc.nextLine();
        MyString s = new MyString();
        s.setString(s1);
        boolean res = s.isPalindrome();
        if (res) {
            System.out.println("It's a Palindrome.");
        } else {
            System.out.println("It's not a Palindrome.");
        }
        sc.close();
    }
}
