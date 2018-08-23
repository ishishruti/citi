
public class Person {
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(){	//Default constructor
		
		
		
	}
	
	public Person(int age, String name) {		//Parametrized constructor
		this.age = age;
		this.name = name;
	}
	
	public void display(){
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
		
}
