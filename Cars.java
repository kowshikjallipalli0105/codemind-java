import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
      int m=sc.nextInt(), 
      x=sc.nextInt();
      if(n>m) System.out.println(-1);
      else System.out.println(x/(m-n)+1);
    }
}