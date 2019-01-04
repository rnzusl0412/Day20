package com.test02;

import java.util.Arrays;
import java.util.Collections;

public class MTest01 {
	public static void Prn(String[] array) {
		for(String value : array) {
			System.out.printf("%10s",value);
		}
	}
	
	public static void main(String[] args) {
		String[] array = {"java","spring","python","jquery","hadoop"};
		Collections.sort(Arrays.asList(array));
		System.out.println("\n ���� �� ���");
		Prn(array);
		
		System.out.println("\n �������� ���� �� ���");
		Collections.reverse(Arrays.asList(array));
		Prn(array);
		
		System.out.println("\n �������� ���");
		Collections.shuffle(Arrays.asList(array));
		Prn(array);
		
	}
}
