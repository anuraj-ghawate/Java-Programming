class Overloading 
{
    //By Changing The Number Of Arguments
    public void Show(int A, int B)
    {
        System.out.println("Value Of int A is : "+A);
        System.out.println("Value Of int B is : "+B);
    }

    public void Show(int A, int B,int C)
    {
        System.out.println("Value Of int A is : "+A);
        System.out.println("Value Of int B is : "+B);
        System.out.println("Value Of int C is : "+C);
    }

    //By Changing The Type Of Argument
    public void Display(int No1, int No2)
    {
        System.out.println("Value Of int No1 is : "+No1);
        System.out.println("Value Of No2 is : "+No2);
    }

    public void Display(char c1,char c2)
    {
        System.out.println("Value Of A is : "+c1);
        System.out.println("Value Of B is : "+c2);
    }

    //By Changing The Sequence Of Argument
    public void Displayy(int i, float j)
    {
        System.out.println("Value Of int i is : "+i);
        System.out.println("Value Of float j is : "+j);

    }

    public void Displayy(float j,int i)
    {
        System.out.println("Value Of float j is : "+j);
        System.out.println("Value Of int i is : "+i);

    }
}

class FunctionOverloading
{
    public static void main(String A[])
    {
        Overloading obj = new Overloading();

        obj.Show(11,21,51);

        obj.Display('X','Y');

        obj.Displayy(10.0f,11);
    }
}