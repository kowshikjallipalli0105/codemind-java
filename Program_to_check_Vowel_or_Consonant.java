import java.util.*;
public class kowshik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u' ?"Vowel":"Consonant");
    }
}