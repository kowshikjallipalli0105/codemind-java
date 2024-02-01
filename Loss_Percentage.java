import java.util.*;
public class demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        double o=((a-b)/(double)a)*100;
        System.out.printf("%.2f",o);
    }
}