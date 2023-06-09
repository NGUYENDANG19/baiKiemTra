package nguyen.dev;

public class Person {
	private String name;
	private int age;
	private String city;
	private double salary ;
	
	  public Person(String name, int age, String city, double salary) {
		  super();
		  this.name = name;
		  this.age = age;
		  this.city = city;
		  this.salary = salary;
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "- [name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}
}
