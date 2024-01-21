import java.util.*;

public class program_QuickSort {

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIndx = partition(arr, si, ei);
        quicksort(arr, si, pIndx - 1); // left part
        quicksort(arr, pIndx + 1, ei); // right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // here we are swapping the element of i and j posititon
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("element of the array is: ");
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
