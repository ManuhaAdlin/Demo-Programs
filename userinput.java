import java.util.Scanner;
public class userinput
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value : ");
        int a = sc.nextInt();
        System.out.println("enter b value : ");
        int b = sc.nextInt();
        int x = a+b;
        System.out.println("sum of two numbers = " +x);
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the sides of triangle");
        int s1 = a.nextInt();
        int s2 = a.nextInt();
        int s3 = a.nextInt();
        if(s1==s2 && s2==s3)
            System.out.println("It is an Equilateral Triangle");
        else if( s1==s2 || s2==s3 || s3==s1 )
            System.out.println("It is an Isosceles Triangle");
        else
            System.out.println("It is a Scalene Triangle");
    }
}
