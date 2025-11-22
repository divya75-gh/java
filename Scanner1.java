package practicejava;
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        
        System.out.println("hello " + name + " welcome");
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println(" age: " + age+ " years old");
        scanner.close();
	}

}
