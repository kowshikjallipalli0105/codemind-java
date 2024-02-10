import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String n = sc.next();
        int ld = n.length() - 1;
        int a = Character.getNumericValue(n.charAt(0)) + Character.getNumericValue(n.charAt(ld));
        System.out.println(a);
    }
}