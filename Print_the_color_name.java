import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String s="-1";
        if(ch=='V'){
            s="Violet";
        }
        else if(ch=='I'){
            s="Indigo";
        }
        else if(ch=='B'){
            s="Blue";
        }
        else if(ch=='G'){
            s="Green";
        }
        else if(ch=='Y'){
            s="Yellow";
        }
        else if(ch=='O'){
            s="Orange";
        }
        else if(ch=='R'){
            s="Red";
        }
        System.out.println(s);
    }
}