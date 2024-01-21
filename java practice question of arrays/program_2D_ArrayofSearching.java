import java.util.*;

public class program_2D_ArrayofSearching {

    public static boolean search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("element found at (" + i + "," + j + ")");
                    return true;
                }

            }
        }
        System.out.println("Sorry Element not found:");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("entter the key value: ");
        int key = sc.nextInt();

        search(matrix, key);

    }

}
