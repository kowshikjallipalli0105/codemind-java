import java.util.*;
public class demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String octalstring =sc.next();
        int octaltodecimal =Integer.parseInt(octalstring,8);
        System.out.println(octaltodecimal);
    }
}