import java.util.Scanner;
public class avg10num
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter 10 numbers");
        for (int i = 0; i < 10; i++)
        {
            int n = s1.nextInt();
            sum = sum + n;
        }
                double average = sum / 10;
                System.out.println("avg is" + average);

        }
    }
