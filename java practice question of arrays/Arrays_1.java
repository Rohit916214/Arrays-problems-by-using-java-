import java.util.*;

class problem1 {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

}