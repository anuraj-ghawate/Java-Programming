class Base
{
    public int i;
    public int j;

    public void DisplayBase()
    {
        System.out.println("Inside DisplayBase");
    }
}

class Derived1 extends Base
{
    public int k;
    public void DisplayDerived1()
    {
        System.out.println("Inside Derived1 Display");
        System.out.println("Value Of Base i is : "+i);
        System.out.println("Value Of Base j is : "+j);
        System.out.println("Value Of Derived1 k is : "+k);

    }
}

class Derived2 extends Base
{
    public int x;
    public void DisplayDerived2()
    {
        System.out.println("Inside Derived2 Display");
        System.out.println("Value Of Base i is : "+i);
        System.out.println("Value Of Base j is : "+j);
        System.out.println("Value Of Derived2 x is : "+x);

    }
}

class HierarchalInheritance
{
    public static void main(String A[])
    {
        Derived1 dobj1 = new Derived1();
        Derived2 dobj2 = new Derived2();

        dobj1.DisplayBase();
        dobj1.DisplayDerived1();

        dobj2.DisplayBase();
        dobj2.DisplayDerived2();

    }
}