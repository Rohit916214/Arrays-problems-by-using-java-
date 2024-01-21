import java.util.*;

public class program_Max_Subarray_sum {
    public static void SubArray(int arr[]) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0; // kyuki yaha par sum ki value change ho jayega
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (max_sum < sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println("max sum of subarray: " + max_sum);
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
