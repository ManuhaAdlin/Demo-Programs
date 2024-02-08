import java.util.Scanner;
public class reversenum
{
    public static void main( String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
