import java.util.Scanner;
public class armstrong
{
    public static void main( String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int temp = n;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(temp==sum) {
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}