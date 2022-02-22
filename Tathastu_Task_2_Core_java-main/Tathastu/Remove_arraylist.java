import java.util.ArrayList;

public class Remove_arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(5);

        System.out.println("\nThe Elements in ArrayList are: ");
        arr.add("Rushabh");
        arr.add("Nilesh");
        arr.add("Mehul");
        arr.add("Shreya");
        arr.add("Rohit");

        for (String name : arr) {
            System.out.println("Name is: " + name);
        }

        arr.remove(1);
        arr.remove("Rohit");

        System.out.println("\nAfter removing the element, ArrayList contain: ");
        for (String name : arr) {
            System.out.println("Name is: " + name);
        }
    }
}