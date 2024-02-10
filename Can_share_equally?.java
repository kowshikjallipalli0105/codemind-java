import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println((x>0 && x%2==0) || (x==0 && y%2==0) ? "YES" : "NO");
    }
}