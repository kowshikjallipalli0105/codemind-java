import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextDouble(),hra=sc.nextDouble(),da=sc.nextDouble();
        System.out.printf("%.2f
",bs*0.12);
        System.out.printf("%.2f",bs+hra+da+(bs*0.12));
    }
}