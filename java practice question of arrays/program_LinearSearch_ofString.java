import java.util.*;

public class program_LinearSearch_ofString {
    public static int linearSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no of element in array: ");
        int n = sc.nextInt();
        System.out.print("key value: ");
        String key = sc.next();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("key at index : " + index);
        }

    }

}
// Time complexcity of linear search o(n)
