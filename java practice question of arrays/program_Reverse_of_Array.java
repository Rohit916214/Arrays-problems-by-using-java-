import java.util.*;

public class program_Reverse_of_Array {
    public static void reverseArray(int arr[]) {
        int temp;
        int fi = 0;
        int li = arr.length - 1;
        while (fi <= li) {
            temp = arr[fi];
            arr[fi] = arr[li];
            arr[li] = temp;

            fi++;
            li--;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of element in array:");
        int n = sc.nextInt();
        System.out.println("Enter Elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

// Time complexity is O(n)