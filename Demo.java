package oop.Encapsulation;

public class Demo {

	public static void main(String[] args) {
    	human obj = new human();
    	obj.setAge(11);
    	obj.setName("divya");
    	System.out.println(obj.getAge() + "  " + obj.getName()); // in another class we can acess private data by getters and setters
    }
}
