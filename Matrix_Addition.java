import java.util.*;

public class kowshik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        
        // Input for matrix A
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        
        // Input for matrix B
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[r1][c1];
        
        // Matrix addition
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        // Output the result
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
