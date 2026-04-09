class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside Base Constructor");
        this.i = 11;
        this.j = 21;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base
{
    public int x;

    public Derived()
    {
        System.out.println("Inside Derived Constructor");

        this.x = 51;
    }

    public void gun()
    {
        System.out.println("Inside Gun Of Derived");

        System.out.println("Value Of i : "+super.i);
        System.out.println("Value Of j : "+super.j);
        System.out.println("Value Of x : "+this.x);
    }

}

class ThisSuper
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.gun();
    }
}