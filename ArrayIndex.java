import java.util.*;

class ArrayIndex
{
   public static void main(String A[])
   {
      Scanner sobj = new Scanner(System.in);

      int Arr[] = {11,21,51,101,111};
      
      System.out.println("Enter The Index Of Array : ");
      int index = sobj.nextInt();

      System.out.println("Element At That Index Is : "+Arr[index]);

      System.out.println("End Of Application...");
   
   }
}