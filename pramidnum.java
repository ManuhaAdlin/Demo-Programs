public class pramidnum
{
    public static void main (String args[])
    {
        int value = 1;

        for(int i=1; i<=5; i++)
        {
            for (int j=2; j<=i; j++)
            {
                System.out.print(value+ " ");
                value++;
                System.out.println();
            }
        }
    }
}
