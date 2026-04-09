class Base
{
    public int i;

    public Base()
    {
        System.out.println("Inside Base Constructor");
        this.i = 11;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base
{
    public int i;

    public Derived()
    {
        System.out.println("Inside Derived Constructor");

        this.i = 21;
    }

    public void gun()
    {
        System.out.println("Inside Gun Of Derived");

        System.out.println("Value Of i : "+i);      //21
        System.out.println("Value Of i From Base : "+super.i);  //11
     }
}

class ThisSuperXX
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.gun();

        System.out.println(dobj.i); //21 Bcz reference dobj is type of Derived
    }
}