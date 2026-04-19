abstract class Demo
{
    public int i,j;

    public int Add(int A, int B) //concrete method
    {
        return A+B;
    }
}

class Abstract_Demo 
{
    public static void main(String A[])
    {
       Demo dobj = new Demo(); //error
    }
}
