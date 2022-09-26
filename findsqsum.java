import java.util.*;
public class findsqsum{
    public static void main(String[] args){
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sq;
        for(int i=1;i<=n;i++)
        {
            sq=i*i;
            System.out.println(i+"--> "+sq);
            sum=sum+sq;
        }
        System.out.println("sum of square --> "+sum);
    }
}
