import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="-1";
        if(n==1||n==12||n==11) s="Winter";
        else if(n==4||n==5||n==6) s="Summer";
        else if(n==7||n==8||n==9||n==10) s="Rainy";
        else if(n==2||n==3) s="Spring";
        System.out.println(s);
    }
}