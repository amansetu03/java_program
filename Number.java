import java.util.*;
public class Number
{
  public static void main(String[] args)
  {
	int number,sum=0;
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	   	System.out.print("Enter the number ");
		number=sc.nextInt();
		if(number<0)
		{
		  System.out.println("\nProgram terminated ");
		  break;
		}
		sum=sum+number;
		System.out.println("The sum is "+sum);
	}
   }

}