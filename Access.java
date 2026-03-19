class Demo
{
    public int i;
    private int j;
    protected int k;

    public Demo()
    {
        i = 0;
        j = 0;
        k = 0;
    }

    public void Display()
    {
        System.out.println("Value Of I : "+i); //Allowed
        System.out.println("Value Of J : "+j); //Allowed
        System.out.println("Value Of K : "+k); //Allowed

    }
}
class Access
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();



        dobj.Display();

        System.out.println("Value Of I : "+dobj.i); //Allowed
        System.out.println("Value Of J : "+dobj.j); //Not Allowed
        System.out.println("Value Of K : "+dobj.k); //????
    }
}