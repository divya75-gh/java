package prgcoding;

public class subarray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     
       int[]  sub_array = {1,3,2,3,1};
       int sub_count = 0, i = 0, j = 1;
       
       if (sub_array.length < 3)
       {
    	   System.out.println(0);  // prints 0 if array no.of.values are less than 3
    	   return;
       }
       for(int k = 2; k <= sub_array.length-1; k++)
       {
    	   if (sub_array[i] + sub_array[k] == sub_array[j])
    	   {
    		   sub_count++;
    	   }
    	   i++;
    	   j++;
       }
       System.out.println("sub-array count is: " + sub_count );
       
    }

}
