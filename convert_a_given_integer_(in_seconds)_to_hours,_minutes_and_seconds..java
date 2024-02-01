import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int h=s/3600;
        int m=(s%3600)/60;
        int se= (s%3600)%60;
        System.out.printf("H:M:S-%d:%d:%d",h,m,se);
    }
}