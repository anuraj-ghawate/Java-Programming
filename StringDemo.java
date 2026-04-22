class StringDemo
{
    public static void main(String A[])
    {
        String s1 = "Hello";                //string literal pool
        String s2 = new String ("Ganesh");  //heap

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.length()); //5
        System.out.println(s2.length()); //6
    }
    
}
