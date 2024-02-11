import java.util.*;
public class kowshik{
    static boolean isprime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<(n/2)+1;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt(),c=0;
        for(int i=m;i<=n;i++) if(isprime(i)) c++;
        System.out.println(c);
    }
}