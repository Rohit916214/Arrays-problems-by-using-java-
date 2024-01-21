import java.util.*;

public class programs_BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array:");
        int n = sc.nextInt();
        System.out.println("Enter key value:");
        int key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Sorry Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }

    }

}
// Time complexity of binary search is O(log n)
