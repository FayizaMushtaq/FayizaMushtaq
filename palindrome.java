import java.util.*;
class palindrome {
   public static void main(String ar[]) {
	int n;
	System.out.println("enter any no ");
        Scanner Sc =new Scanner(System.in);
         n=Sc.nextInt();
  int r,sum=0,temp; 
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  