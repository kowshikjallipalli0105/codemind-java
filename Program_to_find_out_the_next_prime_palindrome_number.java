import java.util.*;
public class demo{
    static boolean isPalin(int num){
        String s=String.valueOf(num);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      while(true){
          n++;
          if(isPalin(n) && isPrime(n)) break;
      }
      System.out.println(n);
    }
}