import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double height=sc.nextDouble();
      if(height<150) System.out.println("Person is Dwarf.");
      else if(height>=150 && height<=165) System.out.println("Person is average heighted.");
      else if(height>165 && height<=195) System.out.println("Person is taller.");
      else System.out.println("Abnormal height.");
    }
}