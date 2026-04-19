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
    //Error due to missing body of Area and Circumference
}

class DemoInterfaceMethod
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
    }
}