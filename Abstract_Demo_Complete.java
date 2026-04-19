abstract class Demo
{
    public int i,j;

    public int Add(int A, int B) //concrete method
    {
        return A+B;
    }
    public abstract int Sub(int A, int B);
    
}

class Hello extends Demo
{
    public int Sub(int A, int B)
    {
        return A-B;
    }
}
class Abstract_Demo_Complete
{
    public static void main(String A[])
    {
       Hello hobj = new Hello();

       System.out.println(hobj.Add(10,11));

       System.out.println(hobj.Sub(10,11));
    }
}
