import java.util.*;
public class kowshik{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
          double x1=sc.nextDouble();
          double x2=sc.nextDouble();
          double y1=sc.nextDouble();
          double y2=sc.nextDouble();
          int ans;
          if(y1/x1<y2/x2) ans=-1;
          else if(y1/x1>y2/x2) ans=1;
          else ans=0;
          System.out.println(ans);
      }
    }
}