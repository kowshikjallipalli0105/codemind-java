import java.util.*;
public class kowshik{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double n=sc.nextDouble(),ans=0;
      for(int i=1;i<=n;i++){
          ans+=1.0/i;
      }
      System.out.printf("%.2f",ans);
    }
}