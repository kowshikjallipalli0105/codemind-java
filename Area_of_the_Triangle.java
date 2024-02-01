import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double s=(a+b+c)/2.0;
        System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}