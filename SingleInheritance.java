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
class SingleInheritance
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
       
        dobj.DisplayBase();
        dobj.DisplayDerived();
        
        
    }
}