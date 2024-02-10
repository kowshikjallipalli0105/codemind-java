import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hf=sc.nextInt();
        int sf=sc.nextInt();
        int spf=sc.nextInt(),ans;
        if(hf>50 && sf>60 && spf>100) ans=10;
        else if(hf>50 && sf>60) ans=9;
        else if(spf>100 && sf>60) ans=8;
        else if(hf>50 && spf>100) ans=7;
        else if(hf>50 || sf>60 || spf>100) ans=6;
        else ans=5;
        System.out.println(ans);
    }
}