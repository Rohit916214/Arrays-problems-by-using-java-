import java.util.Scanner;

public class program_InsertionSort {
    public static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int n = sc.nextInt();
        System.out.println("enter the element ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        insertionsort(arr);
        printarr(arr);
    }

}
