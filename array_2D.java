package prgcoding;

public class array_2D {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        int[][]  arr= {
        		{1,2},
        		{3,6},
        		{7,8}
        };
        for(int i =0; i<arr.length; i++) {
        	for(int j=0; j<arr[i].length; j++) {
        		System.out.print(arr[i][j] + "  ");
        	}
        	System.out.println();
        }
		
		
	}

}
