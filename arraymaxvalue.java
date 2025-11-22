package prgcoding;
import java.util.Scanner;
public class arraymaxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[]= new int[5];
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("enter ARRAY VALUES");
        
        for(int j=0; j <= arr.length-1; j++)
        {
        	 System.out.printf("enter ARRAY VALUES %d :" , j );
             arr[j] = scanner.nextInt();
             
        }
        for(int i=0; i<=arr.length-1; i++) 
        {
            System.out.println(arr[i]);
        }
        int max= arr[0];
        for(int k=0; k<=arr.length-1; k++) {
        	if(max<arr[k] ){
        		max=arr[k];
        	}
        }
        	System.out.println("max value is:" + max);
        
       //
        	        
	}
	
}
