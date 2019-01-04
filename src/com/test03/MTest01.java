package com.test03;

import java.util.Arrays;

public class MTest01 {

	public static void Prn(Addr[] s) {
		for (Addr t : s) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		Addr[] a = { new Addr("±è±¹Çö", 28, "010"), new Addr("¿À½Â·æ", 29, "4360"), new Addr("¼ÛÁø¿µ", 27, "4941") };

		Prn(a);

		System.out.println();
		Arrays.sort(a);
		Prn(a);
	}

}
