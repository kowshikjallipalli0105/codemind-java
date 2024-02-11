import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
      String ans="";
      while(n>0){
          n--;
          char ch=(char)(n%26+'A');
          n/=26;
          ans=ch+ans;  
      }
        System.out.println(ans);
    }
}