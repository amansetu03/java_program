import java.util.*;

public class sqsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1;
        int sum = 0;
        System.out.println("Enter number ");
        n = sc.nextInt();
        if (n >= 1 && n <= 100) {
            for (i = 1; i <= n; i++) {
                sum = sum + i * i;
            }
        } else {
            System.out.println("You have enter wrong number");
        }

        System.out.println("sum of squar is " + sum);
    }
}