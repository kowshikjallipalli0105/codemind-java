import java.util.*;
public class kowshik{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String cid=sc.nextLine(), name=sc.nextLine();
      double u=sc.nextDouble(), b, s=100,tb;
    if(u<=199) b=u*1.2;
    else if(u>=200 && u<400) b=u*1.5;
    else if(u>=400 && u<600) b=u*1.8;
    else b=u*2;
    if(b>400) s=b*0.15;
    tb=b+s;
      System.out.printf("%.2f",tb);
    }
}