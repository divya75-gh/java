package prgcoding;
import java.util.Scanner;
public class arrvaluessum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
     int[] arr = new int[5];
     for(int i=0; i<=arr.length-1; i++) {
    	 System.out.println(" enter array values" + i+ ":");
    	 arr[i] = scanner.nextInt(); 
    	 
     }
     int sum = 0;
     for(int j=0; j <= arr.length-1; j++) {
    	 
    	 sum += arr[j];
    	 
     }
     System.out.println("sum of arr:" + sum);
     
	}

}
