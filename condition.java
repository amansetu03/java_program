import java.util.*;
public class condition{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first numer ");
        a=sc.nextInt();
        System.out.println("enter second number ");
        b=sc.nextInt();
        if(a>b){
            System.out.println("first number is greater ");
        }
        else if(b>a){
            System.out.println("second number is greater ");

        }
        else{
            System.out.println("both number are equal ");
        }
    }
}