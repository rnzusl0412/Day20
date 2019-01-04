package com.test03;

import java.util.TreeSet;

public class MTest02 {
	public static void main(String[] args) {
		TreeSet<Addr> ts = new TreeSet<Addr>();
		ts.add(new Addr());
		ts.add(new Addr("±è±¹Çö", 28, "01043"));
		ts.add(new Addr("Á¤¿¹ºó", 26, "604941"));

		System.out.println(ts);
	}
}
