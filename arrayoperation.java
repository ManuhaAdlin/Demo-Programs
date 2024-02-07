import java.util.Scanner;
public class arrayoperation 
{
    public static void main(String args[]) 
    {
        int a[] = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter " + a.length + " elements");
        for (int i = 0; i < a.length; i++)
         {
            a[i] = s1.nextInt();
         }
            System.out.println("the " + a.length + " elements are");
            for (int i = 0; i <= a.length - 1; i++)
            {
                System.out.println(a[i] + "\t");
            }
    }
}

