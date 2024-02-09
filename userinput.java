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
       
    }
}
