import java.util.Scanner;

public class factorial
{
    public static void main (String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int pro=1;
        for (int i=1;i<=n;i++)
        {
            pro=pro*i;
        }
        System.out.println(pro);
    }
}
