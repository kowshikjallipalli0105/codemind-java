import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String s="-1";
        if(ch=='V'||ch=='v'){
            s="Violet";
        }
        else if(ch=='I'||ch=='i'){
            s="Indigo";
        }
        else if(ch=='B'|| ch=='b'){
            s="Blue";
        }
        else if(ch=='G'|| ch=='g'){
            s="Green";
        }
        else if(ch=='Y'||ch=='y'){
            s="Yellow";
        }
        else if(ch=='O'|| ch=='o'){
            s="Orange";
        }
        else if(ch=='R'||ch=='r'){
            s="Red";
        }
        System.out.println(s);
    }
}