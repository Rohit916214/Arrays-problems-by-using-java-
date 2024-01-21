import java.util.*;

public class program_Max_Subarray_by_using_prefix {
    public static void SubArray_byUsing_prefix(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        // calculate prefix array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
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
        SubArray_byUsing_prefix(arr);
    }

}

// Time Complexity is O(n^2)
