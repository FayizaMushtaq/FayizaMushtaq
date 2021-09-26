public class nestedswitch 
{
   public static void main(String[] args)
   {
      int classpassed = 12;
      int marks =75 ;
      switch(classpassed) //
      {
         case 10:
         System.out.println("you are not eligible for JEE ");
         break;
         case 11:
         System.out.println("you are not eligible for JEE");
         break;
         case 12:
         switch(marks)
         {
            case 50:
            System.out.println("You are not eligible for JEE");
            break;
            case 75:
            System.out.println("Congrats!!!!! you are eligible for JEE");
            break;
         }
         break;
         default: System.out.println("Please enter valid Details");
     }
   }
}