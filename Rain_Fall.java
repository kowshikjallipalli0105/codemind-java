import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        if(r<3) System.out.println("LIGHT");
        else if(r>=3&&r<7) System.out.println("MODERATE");
        else System.out.println("HEAVY");
    }
}