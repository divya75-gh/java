package practicejava;

public class typecasting { 
    
	public static void main(String[] args) {
		
		 int a = 10;
		 double b = a;// widening
		 double c = 24;
		 int d =(int)c;// narrowing
		    
        System.out.printf("a=%d : b=%.1f %nc=%.1f : d=%d",a, b, c, d);
	}

}
