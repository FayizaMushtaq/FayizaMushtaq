import java.util.*;
  
class reversepyramid{
      
public static void main (String[] args) 
{
 int i, j,rows;
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = scan.nextInt();
   
      
   
    for(i = rows; i >= 1; i--)
    {
          
        
        for(j = i; j < rows; j++)
        {
            System.out.print(" ");
        }
          
     
        for(j = 1; j <= (2 * i - 1); j++)
        {
            System.out.print("*");
        }
          
      
        System.out.println("");
    } 
}
}