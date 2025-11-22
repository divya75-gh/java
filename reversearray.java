package prgcoding;
import java.util.Scanner;
public class reversearray {
	public static void main(String[] args) 
	{

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the value that how many numbers you have to add");
		int value = scanner.nextInt();
		int[] arr= new int[value];
		
		for(int i=0;i<= arr.length-1; i++)
		{
			System.out.println("enter array value "+ i + ":");
			arr[i]= scanner.nextInt();
		}
		
		for(int j=value-1; j >=0; j--) 
		{
			System.out.println(arr[j]);
		}	
	}
	

}
