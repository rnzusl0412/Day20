package com.test01;

public class ProFileTest {
	public static void main(String[] args) {
		ProFile<String> p1 = new ProFile<String>("Dominica","������");
		ProFile<String> p2 = new ProFile<String>("Dominico","����");
		
		System.out.println(p1.getName() + "  " + p1.getDept());
		System.out.println(p2.getName() + "  " + p2.getDept());
	}
}
