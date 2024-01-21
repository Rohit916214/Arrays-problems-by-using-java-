import java.util.*;

class program_Largest_LinearSearch {
    public static int largest_no(int arr[]) {
        int max = Integer.MIN_VALUE; // - infinity
        int min = Integer.MAX_VALUE; // + INFINITY
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];

            }

        }
        System.out.println("Smallest value is: " + min);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = largest_no(arr);
        System.out.println("max number are: " + index);

    }
}