class StringCompare
{
    public static void main(String A[])
    {
        String s1 = "Ganesh";           
        String s2 = new String ("Ganesh");  

        if(s1 == s2) //here we are comapring hashcode due to which not equal
        {
            System.out.println("Strings Are Equal");
        }
        else 
        {
            System.out.println("Strings Are Not Equal");

        }
       
    }
    
}
