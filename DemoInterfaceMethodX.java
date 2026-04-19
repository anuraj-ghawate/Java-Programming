interface Circle 
{   
    //characteristics (public,static,final)
    float PI = 3.14f;       
    
    //Behaviours (public,abstract)
    float Area(float Redius);
    float Circumference (float Redius);
}

class Marvellous implements Circle
{
    public float Area(float Redius)
    {
        return Circle.PI * Redius * Redius;
    }
    public float Circumference (float Redius)
    {
        return 2 * Circle.PI * Redius;
    }
}

class DemoInterfaceMethodX
{
    public static void main(String A[])
    {
        //Circle cobj = new Circle();  Not Allowed
        Marvellous mobj = new Marvellous();
        
        float Ret = 0.0f;

        Ret = mobj.Area(10.5f);
        System.out.println("Area Of circle : "+Ret);

        Ret = mobj.Circumference(10.5f);
        System.out.println("Circumference Of circle : "+Ret);
    }
}