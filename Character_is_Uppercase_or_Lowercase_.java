import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch>='A' && ch<='Z' ? "uppercase alphabet" :(ch>='a' && ch<='z' ? "lowercase alphabet" : "not an alphabet"));
    }
}