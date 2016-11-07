// The "Primenumber" class.
import java.awt.*;
import hsa.Console;

public class Primenumber
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter an integer that you want to check if it is prime:");
	int input;
	input = c.readInt();
	int i=2;
	boolean Prime = true;
	for (i=2 ; i < (int)Math.round ( Math.sqrt(input)); i++)
	{
	    if (input % i !=0)
	    { 
	    Prime= true;
	    }else
	    {
	    Prime = false;
	    }
	}
	if(Prime)
	{
	System.out.println("It is a prime number!");
	}else
	{
	System.out.println("It is not a prime number!");
	}
	    
	
	// Place your program here.  'c' is the output console
    } // main method
} // Primenumber class
