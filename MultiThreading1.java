class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method");
    }
}

class MultiThreading1
{
    public static void main(String A[])
    {
        System.out.println("Main Thread Is Running");
        
        Demo dobj1 = new Demo(); //Thread1

        Demo dobj2 = new Demo(); //Thread2

        dobj1.start();
        dobj2.start();

    }   
}



