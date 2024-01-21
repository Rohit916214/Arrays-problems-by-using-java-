import java.util.*;

public class program_SelectionSort {
    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minnum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minnum] > arr[j]) {
                    minnum = j;

                }
            }
            int temp = arr[minnum];
            arr[minnum] = arr[i];
            arr[i] = temp;

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

        selectionsort(arr);
        printarr(arr);
    }

}
