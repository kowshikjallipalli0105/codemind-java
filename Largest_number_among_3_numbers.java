import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
        System.out.println(num1>num2 && num1>num3?num1:(num2>num3&& num2>num1?num2:num3));
    }
}