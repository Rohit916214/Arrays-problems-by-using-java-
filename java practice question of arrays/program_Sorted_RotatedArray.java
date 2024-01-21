import java.util.*;

class Sorted_RotatedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        int mid = si + (ei - si) / 2;
        // case not found
        if (si > ei) {
            return -1;
        }
        // case found
        if (arr[mid] == tar) {
            return mid;
        }
        // mid lies on li
        if (arr[si] <= arr[mid]) {
            // case 1-a> left part
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case 1-b> rigth part
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid lies on l2
        else {
            // case 2-a> right part
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int tar = sc.nextInt();
        int tarIndx = search(arr, tar, 0, n);
        System.out.println(tarIndx);

    }
}