import java.util.*;

class program_mergeSort {

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid); // left part
        divide(arr, mid + 1, ei); // right part
        conqure(arr, si, mid, ei);

    }

    public static void conqure(int arr[], int si, int mid, int ei) {
        // firstly we consider new temporary arraay
        int merge[] = new int[ei - si + 1];
        int idx1 = si; // element of left part of array
        int idx2 = mid + 1; // element of right part of array
        int x = 0; // it is for itteration

        while (idx1 <= mid && idx2 <= ei) {
            // here we sort the element by comparing of left and right part of element
            if (arr[idx1] <= arr[idx2]) {
                merge[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) {
            merge[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= ei) {
            merge[x] = arr[idx2];
            x++;
            idx2++;
        }

        // now we are copying the element from merge array to original array

        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nunber of element in array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}