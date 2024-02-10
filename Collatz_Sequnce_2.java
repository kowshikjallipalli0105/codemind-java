import java.util.*;
public class kowshik{
    static int counts(int n){
      int c=0;
      while(n!=1){
          if(n%2==0) n/=2;
          else n=3*n+1;
          c+=1;
      }
      return c;  
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt(),max=0,ans=0;
      for(int i=a;i<=b;i++){
        if(max<counts(i)){
            max=counts(i);
            ans=i;
        }
      }
      System.out.println(ans);
    }
}