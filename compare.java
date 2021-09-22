import java.util.*;  
 class compare {  
    public static void main(String ar[]) {       
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the num1 ");  
        int num1 = sc.nextInt();  
        System.out.print("Enter the num2 ");  
        int num2 = sc.nextInt();  
        sc.close();         
          int retResult =  Integer.compare(num1, num2);    
          if(retResult > 0) {  
             System.out.println("num1 is greater than num2");  
          } else if(retResult< 0) {  
             System.out.println("num1 is less than num2");  
          } else {  
             System.out.println("num1 is equal to num2");  
          }  
    }  
}  