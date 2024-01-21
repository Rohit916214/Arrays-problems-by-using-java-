import java.util.*;

public class program_Trapping_Rainwater {
    public static int trappRainwater(int[] arr) {
        int N = arr.length;

        // calculate the left max boundary
        int leftmax[] = new int[N];
        leftmax[0] = arr[0];
        for (int i = 1; i < N; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        // calculate the right max boundary
        int rightmax[] = new int[N];
        rightmax[N - 1] = arr[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int trapwater = 0;
        // Loop
        for (int i = 0; i < N; i++) {
            // calculate the waterlevel i.e = min(leftmax bound , rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterLevel - arr[i];

        }

        return trapwater;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element in array:");
        int n = sc.nextInt();
        System.out.println("Enter the Element of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Total Rainwater trap is: " + trappRainwater(arr));

    }

}
