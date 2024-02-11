import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      boolean ans=false;
      for(int i=1;i*i<=n;i++){
          if(Math.sqrt(n-i*i)%1==0 && (n-i*i)!=i*i){
              ans=true;
              break;
          }
      }
      System.out.println(ans ? "True" : "False");
    }
}