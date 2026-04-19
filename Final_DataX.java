class Demo
{
    public final int i; //final data
    public int j; 

    public Demo(int A, int B)
    {
        this.i = A;
        this.j = B;
    }
}

class Final_DataX
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(10,20);

       
        dobj.j = 21; //Allowed
        dobj.j++;    //Allowed
    }
    
}
