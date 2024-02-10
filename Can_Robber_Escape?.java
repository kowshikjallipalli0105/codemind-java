import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] l= new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int count=0;
        for(int i:l){
            if(i%2!=0){
                count++;
            }
        }
        System.out.print(count<=2?"YES":"NO");
        
        
    }
}