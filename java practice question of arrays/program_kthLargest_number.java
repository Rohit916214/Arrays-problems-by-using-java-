import java.util.Scanner;

public class program_kthLargest_number {

    public static int KthLargest(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr[k - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of array:");
        int[] arr = new int[n];
        System.out.println("Enter the kth element:");
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(KthLargest(arr, k));

    }
}
