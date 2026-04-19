import java.util.*;

class ArrayIndexException
{
   public static void main(String A[])
   {
      Scanner sobj = new Scanner(System.in);

      int Arr[] = {11,21,51,101,111};
      
      System.out.println("Enter The Index Of Array : ");
      int index = sobj.nextInt();

      try
      {
         System.out.println("Inside Try Block");
         System.out.println("Element At That Index Is : "+Arr[index]);
      }
      catch(ArrayIndexOutOfBoundsException aobj)
      {
         System.out.println("Exception occured : "+aobj);
      }

      System.out.println("End Of Application...");
   
   }
}