import java.util.*;

public class program_Pairs_in_Array {
    public static void pairs_in_array(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + temp + " " + arr[j] + ") ");
                tp++;

            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array:");
        int n = sc.nextInt();
        System.out.println("Enter the Element in Array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pairs_in_array(arr);

    }
}

// Time complexity is O(n^2)