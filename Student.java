import java.util.*;
class Student{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the student name");
        String name=sc.nextLine();

        System.out.println("enter class");
        int c= sc.nextInt();
        
        System.out.println("enter marks ");
        int m= sc.nextInt();

        System.out.println("Student name is "+name);
        System.out.println("Class is "+c);
        if(m>=80){
            System.out.println("A very good student");
        }
        else if(m<80 && m>=60){
            System.out.println("A good student");
        }
        
        else if(m<60 && m>=50){
            System.out.println("A avarage student");
        }
        else{
            System.out.println("A poor student");
        }
    
    }
}