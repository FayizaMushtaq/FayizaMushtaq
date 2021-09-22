import java.util.*;
class Factorial {
   public static void main(String ar[]) {
	int num;
        System.out.println("enter any no ");
        Scanner Sc =new Scanner(System.in);
         num=Sc.nextInt();
         System.out.println("factorial of" +num+ "is");
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}