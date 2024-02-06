import java.util.Scanner;
public class stringreverse
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.nextLine();
        String reverse("");
        System.out.println(s1);
        for(int i=0;i<s1.length();i++)
        {
            reverse = s1.charAt(i)+reverse;
        }

        System.out.println("the reversed string is : "+reverse);
    }
}
