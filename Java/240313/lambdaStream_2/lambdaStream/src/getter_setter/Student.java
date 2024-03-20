package getter_setter;

public class Student {
	private String name;
	private int age;
	private String address;

	public String showInfo() {
		return "Name: " + name + ", Age: " + age + ", Address: " + address;
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
		if (age < 0) {
			System.out.println("Invalid age");
		} else {
			this.age = age;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
