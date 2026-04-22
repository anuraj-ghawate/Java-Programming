class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method");
    }
}

class ThreadScenerio1X
{
    public static void main(String A[])
    {
        System.out.println("Main Thread Is Running");
        
        Demo dobj = new Demo();  

        Thread tobj = new Thread(dobj);

        tobj.start(); 
    }   
}



