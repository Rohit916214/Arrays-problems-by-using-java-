import java.util.*;

public class program_Max_Subarray_Sum_by_Kadanes_Method {
    public static void kadanes(int arr[]) {
        int Max_Sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            current_sum = current_sum + arr[i];
            if (Max_Sum < current_sum) {
                Max_Sum = current_sum;
            }
            if (current_sum < 0) {
                current_sum = 0;
            }
            // Max_Sum = Math.max(current_sum, Max_Sum);
        }
        System.out.println("Max subarray sum is: " + Max_Sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element in array:");
        int n = sc.nextInt();
        System.out.println("Enter the Element in array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        kadanes(arr);
    }

}

// kadanes method is best method for sum of max value in subarray
// because this code time complexity is O(n)