import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        String l = String.format("%02d", y % 100);
        System.out.println(l);
    }
}