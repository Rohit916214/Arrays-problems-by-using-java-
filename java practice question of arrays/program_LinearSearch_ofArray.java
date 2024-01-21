import java.util.*;

public class program_LinearSearch_ofArray {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
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
