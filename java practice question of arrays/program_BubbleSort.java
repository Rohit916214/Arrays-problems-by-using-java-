import java.util.Scanner;

public class program_BubbleSort {
    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
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

        bubblesort(arr);
        printarr(arr);
    }

}

// the logic of the bubble sort is the select the first element and compare to
// the
// next element and if the element is less than the next element then swap the
// element and it goes
// until and unless the largest element goes on last posotion
