import java.util.*;
class Even {
   public static void main(String ar[]) {
	int n;
	System.out.println("enter any no ");
        Scanner Sc =new Scanner(System.in);
         n=Sc.nextInt();
         System.out.println("list of even nos :");
	for (int i = 1; i <= n; i++) {
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}