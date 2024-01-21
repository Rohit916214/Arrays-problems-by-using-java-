import java.util.*;

public class program_SubArrays {
    public static void SubArray(int arr[]) {
        int total_sub_array = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) { // this loop for print subarray
                    System.out.print(arr[k] + " ");
                }
                total_sub_array++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("total sub_arrays: " + total_sub_array);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element in array:");
        int n = sc.nextInt();
        System.out.println("Enter the Elemet in array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        SubArray(arr);
    }

}

// Time Complexity is O(n^3)
