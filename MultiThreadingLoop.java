class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        for(i = 1; i<=100; i++)
        {
            System.out.println("Inside Run Method Of : "+Thread.currentThread().getName()+" : "+i);

        }
    
    }
}

class MultiThreadingLoop
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



