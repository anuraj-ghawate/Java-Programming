class Demo
{
    public int i;
    public int j;

    public Demo()
    {
        System.out.println("Inside Default Constructor");
        this.i = 0;
        this.j = 0;
    }

   public Demo(int Value1,int Value2)
    {
        System.out.println("Inside Parameterised Constructor");
        this.i = Value1;
        this.j = Value2;
    }
}

class Constructor
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);

    }
}