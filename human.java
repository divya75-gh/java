package oop.Encapsulation;

public class human {
    private int age;
    private String name;
    public int getAge() {
    	return age;
    }
    public void setAge(int a) {
    	age = a;
    }
    public String getName() {
    	return name;
    }
    public void setName(String n) {
    	name = n;
    }
    public static void main(String[] args) {
    	human obj = new human();
    	obj.age=12;
    	obj.name="something";  
    	System.out.println(obj.age + " " + obj.name);     // we can access directly by obj in same class and also by getters and setters too
    	obj.setAge(11);
    	obj.setName("divya");
    	System.out.println(obj.getAge() + "  " + obj.getName());
    }
}
