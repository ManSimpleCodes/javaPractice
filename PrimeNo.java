package manuse;

import java.util.Scanner;

class PrimeNo
{
   public static void main (String[] args)
   {		
       int i;
       int j;
       //Empty String
       String  primeNumbers = "";
       @SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
		System.out.println("enter number ");
		int n=scan.nextInt();

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(j =i; j>=1; j--)
	  {
             if(i%j==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}
