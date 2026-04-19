import java.util.*;

class DivisionExceptionFinally
{
 public static void main(String A[])
 {
    Scanner sobj = new Scanner(System.in);

    int No1 = 0,  No2 = 0, Ans = 0;

    System.out.println("Enter First Number : ");
    No1 = sobj.nextInt();

    System.out.println("Enter Second Number : ");
    No2 = sobj.nextInt();

   try
   {
         System.out.println("Inside try Block");
         Ans = No1 / No2;
   }
   catch(ArithmeticException aobj)
   {
         System.out.println("Inside catch Block");
         System.out.println("Exception Occured : "+aobj);
   }
   catch(Exception eobj)
   {
      System.out.println("Inside Generic Catch"+eobj);
   }
   finally
   {
      System.out.println("Inside Finally Block");
      sobj = null; //Resource Deallocation
   }

    System.out.println("Division Is : "+Ans);
 } 

}
