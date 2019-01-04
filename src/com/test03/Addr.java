package com.test03;

@SuppressWarnings("rawtypes")
public class Addr implements Comparable {
	private String name;
	private int age;
	private String phone;

	public Addr() {
		super();
	}

	public Addr(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Addr [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

	public int compareTo(Object o) {
		Addr res = (Addr) o;
		if (this.getAge() == res.getAge()) {
			System.out.println();
		}
		return 0;
	}
	
	
}
