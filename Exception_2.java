class myexception extends Exception 
{
    public myexception(String str) {
        super(str);
    }
}
public class Exception_2 {
    public static void main(String args[]) {
        try 
        {
            throw new myexception("I am try block");
        }
        catch (myexception e)
        {
            System.out.println("I am catch block ");
            System.out.println(e.getMessage());
        }
    }
}
