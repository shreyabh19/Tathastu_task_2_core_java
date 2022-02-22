import java.util.*;

class StringPlaiindrome {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String str = s.nextLine();
        String rev = "";
        char ch[] = str.toCharArray();
        System.out.println("string before reversing");
        System.out.println("string is =" + str);

        System.out.println("\nstring after reversing");
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println("reverse is=" + rev);

        if (str.equals(rev) == true)
            System.out.println(str + " is pallindrome");
        else
            System.out.println(str + " is not pallindrome");
        s.close();
    }
}