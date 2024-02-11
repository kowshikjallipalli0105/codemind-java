import java.util.*;
public class demo{
    static long lcm(long a, long b){
        return a*b/gcd(a,b);
    }
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
          long n=sc.nextLong();
          long a=sc.nextLong();
          long b=sc.nextLong();
          long k=sc.nextLong();
          long divisibleByA=n/a;
          long divisibleByB=n/b;
          long divisibleByBoth=n/lcm(a,b);
     System.out.println((divisibleByA+divisibleByB-2*divisibleByBoth)>=k ? "Win" : "Lose");
      }
    }
}