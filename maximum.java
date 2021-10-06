import java.util.Scanner;

public class maximum
{
    public static void main(String args[])
    {
        int a, b, max;
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter Two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
      
        if(a>b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
      
        System.out.print("maximum of Two Number is " +max);
    }
}