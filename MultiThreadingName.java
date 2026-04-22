class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method Of : "+Thread.currentThread().getName());
    
    }
}

class MultiThreadingName
{
    public static void main(String A[])
    {
        System.out.println("Main Thread Is Running");
        
        Demo dobj1 = new Demo(); //Thread1

        Demo dobj2 = new Demo(); //Thread2

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

    }   
}



