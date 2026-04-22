class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        try
        {
            for(i = 1; i<=10; i++)
            {
                System.out.println("Inside Run Method Of : "+Thread.currentThread().getName()+" : "+i);
                Thread.sleep(3000);
            }
        }
        catch(Exception eobj)
        {

        }
    
    }
}

class MultiThreadingSleep
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Main Thread Is Running");
        
        Demo dobj1 = new Demo(); //Thread1

        Demo dobj2 = new Demo(); //Thread2

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();

        System.out.println("End of Main Thread");

    }   
}



