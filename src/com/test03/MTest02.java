package com.test03;

import java.util.TreeSet;

public class MTest02 {
	public static void main(String[] args) {
		TreeSet<Addr> ts = new TreeSet<Addr>();
		ts.add(new Addr());
		ts.add(new Addr("�豹��", 28, "01043"));
		ts.add(new Addr("������", 26, "604941"));

		System.out.println(ts);
	}
}
