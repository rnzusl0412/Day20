package com.test02;

import java.util.Arrays;

public class EmpTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Emp e1 = new Emp("±è±¹Çö", "aaa111");
		Emp e2 = new Emp("¼ÛÁø¿µ", 222);
		System.out.println(e1);
		System.out.println(e2);

		Emp e3 = new Emp("¿À½Â·æ", 90.9);
		System.out.println(e3.getEmp_name() + "\t" + e3.getEmp_no());

		System.out.println(Character.compare('A', 'C'));

		Character c1 = new Character('A');
		Character c2 = new Character('C');

		System.out.println(c1.compareTo(c2));

		System.out.println("abcde".compareTo("abcde"));

		String[] str = { "a1111", "c1111", "f1111", "d1111", "b1111" };

		System.out.println(str);
		Prn(str);
		System.out.println();
		Arrays.sort(str);
		Prn(str);
	}

	public static void Prn(String[] r) {
		for (String s : r) {
			System.out.printf("%10s", s);
		}
	}
}
