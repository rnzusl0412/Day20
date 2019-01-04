package com.test01;

public class ProFileTest {
	public static void main(String[] args) {
		ProFile<String> p1 = new ProFile<String>("Dominica","관리자");
		ProFile<String> p2 = new ProFile<String>("Dominico","직원");
		
		System.out.println(p1.getName() + "  " + p1.getDept());
		System.out.println(p2.getName() + "  " + p2.getDept());
	}
}
