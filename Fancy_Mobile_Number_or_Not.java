import java.util.*;
public class kowshik{
    static boolean checks(String n){
       
        char[] arr=n.toCharArray();
        for(int i=0;i<=6;i++){
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2]) return true;
            if(arr[i]==arr[i+1]+1 && arr[i+1]==arr[i+2]+1) return true;
            if(arr[i]==arr[i+1]-1 && arr[i+1]==arr[i+2]-1) return true;
        }
        for(char digit='0';digit<='9';digit++){
            int cou=0;
            for(int i=0;i<10;i++){
                if(arr[i]==digit) cou++;
            }
            if(cou>=5) return true;
        }
        return false;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String n=sc.next();
      if(n.length()!=10) {
         System.out.println(-1);
         return;
      }
      System.out.println(checks(n) ? "FANCY NUMBER":"NOT A FANCY NUMBER");
    }
}