class Base
{
    public int i;

    public Base(int no)
    {
        System.out.println("Inside Base Constructor");
        this.i = no;
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
        super(11); //Explisit Call To The Base constructor 
        
        System.out.println("Inside Derived Constructor");

        this.i = 21;
    }

    public void gun()
    {
        System.out.println("Inside Gun Of Derived");

        System.out.println("Value Of i : "+i);
        System.out.println("Value Of i From Base : "+super.i);
     }
}

class SuperDemoX
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.gun();
    }
}