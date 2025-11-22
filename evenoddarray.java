package prgcoding;
import java.util.Scanner;
public class evenoddarray 
{

   public static void main(String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   int[] arr= new int[5];
	   for(int i=0; i<=arr.length-1; i++) 
	   {
		   System.out.println("enter array value of " +i+ ":");
		   arr[i]= scanner.nextInt();
	   }
	   
	   int evenCount=0, oddCount = 0;
	   
	   System.out.println(" numbers in array:"); 
	   for(int j=0; j<=arr.length-1; j++) 
	   {
		   if(arr[j] % 2 == 0)
		   {
			   evenCount++;
			   System.out.println(arr[j]); 
		   }
		   else
		   {
			   oddCount++;
			   System.out.println(arr[j]); 
		   }
	   }
	   
	   System.out.println("number of even numbers in array:" + evenCount);
	   System.out.println("number of odd numbers in array:" + oddCount);
	}
	     
		  
		   
		   
			 
		
		   
	   
	  
   }

