import java.util.*;
public class kowshik{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int physics=sc.nextInt(),
      chemistry=sc.nextInt(),
      biology=sc.nextInt(),
      mathematics=sc.nextInt(),
      computerScience=sc.nextInt(),
      percentage=(physics+chemistry+biology+mathematics+computerScience)*100/500;
      if(percentage>=90) System.out.println("Grade A");
      else if(percentage>=80) System.out.println("Grade B");
      else if(percentage>=70) System.out.println("Grade C");
      else if(percentage>=60) System.out.println("Grade D");
      else if(percentage>=40) System.out.println("Grade E");
      else System.out.println("Grade F");
    }
}