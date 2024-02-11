import java.util.*;
public class kowshik{
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),c=0;
      for(int i=1;i*i<=n;i++) 
        if(isPrime(i) && i*i<=n) c++;
      System.out.print(c);
    }
}