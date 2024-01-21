import java.util.Scanner;
import java.util.HashSet;

//by using only loop method

public class program_toFindDuplicate_Element_in_Array {
    public static boolean dublicate(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag += 1;
                    return true;
                }

            }
            if (flag > 0) {
                break;
            }

        }
        return false;
    }

    // by using of HashSet Method

    public static boolean du(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        if (hs.size() < arr.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of element in array:");
        int n = sc.nextInt();
        System.out.println("Enter Elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(du(arr));

    }
}