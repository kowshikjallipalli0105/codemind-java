import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=0;
            for(int i=a;i<=b;i++){
                 String numStr=Integer.toString(i);
              char ch=numStr.charAt(numStr.length()-1);
              if(ch=='2' || ch=='3' || ch=='9') c++;
            }
        System.out.println(c);
        }
    }
}