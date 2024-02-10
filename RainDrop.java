import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
      String ans;
      if(n%3==0 && n%5==0) ans="PlingPlang";
    else if(n%7==0) ans="Plong";
    else if(n%5==0) ans="Plang";
    else if(n%3==0) ans="Pling";
    else ans=Integer.toString(n);
        System.out.println(ans);
    }
}