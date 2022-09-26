import java.util.*;
class Myclass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter int , double, String ");

        String user_name=sc.nextLine();
        int p= sc.nextInt();
        double d = sc.nextDouble();
       // String user_name=sc.nextLine();

        System.out.println("int number is "+p);
        System.out.println("double is "+d);
        System.out.println("user name is "+user_name);
    }
}