1. To check if the number is positive ,negative or zero.
/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int num=2;
       
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else
        if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
	
         
    }
}

2. To check if the number is even or odd:
/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int num=5;
    System.out.println("Enter an Integer number:");
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}


