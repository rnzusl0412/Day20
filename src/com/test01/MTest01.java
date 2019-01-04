package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.replace('a', 'R'));
		System.out.println(s.substring(0, 3));
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("C") + 1);
	}
}
