import java.util.Scanner;

public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        if(rows<3){
            System.out.print("The pattern is not possible");
            
        }
        else{
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }}
}
