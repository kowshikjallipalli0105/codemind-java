import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         double b=sc.nextDouble();
      double g;
      if (b<=10000)
    {
        g=b+(b*0.8)+(b*0.2);
    }
    else if(b<=20000)
    {
        g=b+(b*0.9)+(b*0.25);
    }
    // else if (b>20000)
    else
    {
        g=b+(b*0.95)+(b*0.3);
    }
        
        System.out.printf("%.2f",g);
    }
}