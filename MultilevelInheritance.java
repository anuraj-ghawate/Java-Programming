class Base
{
    public int i;
    public int j;

   public void DisplayBase()
    {
        System.out.println("Inside Base Display");
    }
}

class Derived extends Base
{
    public int k;

    public void DisplayDerived()
    {
        System.out.println("Inside Derived Display");
        System.out.println("value Of Base i is : "+i);
        System.out.println("value Of Base j is : "+j);
        System.out.println("value Of Derived k is : "+k);
        
    }
}

class DerivedX extends Derived
{
    public int x;

     public void DisplayDerivedX()
    {
        System.out.println("Inside DerivedX Display");
        System.out.println("value Of Base i is : "+i);
        System.out.println("value Of Base j is : "+j);
        System.out.println("value Of Derived k is : "+k);
        System.out.println("value Of DerivedX x is : "+x);
        
    }

}
class MultilevelInheritance
{
    public static void main(String A[])
    {
        DerivedX dobj;
        dobj = new DerivedX();

        dobj.DisplayDerivedX();

    }
}