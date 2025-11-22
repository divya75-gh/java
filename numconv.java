package practicejava;

public class numconv {

	public static void main(String[] args) {
		
		//number to string conversion
		//string.valueof();
		int num = 10;
		String str= String.valueOf(num);
		System.out.println(str);
         //...
		//datatype.tostring();
		int x = 100;
		String n = Integer.toString(x);
		System.out.println(n);
		
		
		//string to numbers coversion
		//Integer.parseInt();
		String number = "1234";
		Integer y = Integer.valueOf(number);
		System.out.println(y);
		
		//Integer.parseInt()
		String number2= "5678";
		Integer z = Integer.parseInt(number2);
		System.out.println(z);
	
        
	}

}
