import java.util.Scanner;
public class avgoddeven
{
    public static void main(String[] args)
    {
        System.out.println(" enter the num" );
        Scanner s1 = new Scanner(System.in);
        int sum = 0, evennum=0, oddnum=0;
        int  a = s1.nextInt();
        for (int i = 0; i < a ; i++)
        {
            int n = s1.nextInt();
            if(n%2==0)
                evennum = evennum + n;
            else
                oddnum = oddnum + n;
        }

        System.out.println(" sum of even num is" + evennum );
        System.out.println(" sum of odd num is" + oddnum);

    }
}
