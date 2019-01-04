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
		System.out.println("\n 정렬 후 출력");
		Prn(array);
		
		System.out.println("\n 역순으로 정렬 후 출력");
		Collections.reverse(Arrays.asList(array));
		Prn(array);
		
		System.out.println("\n 랜덤으로 출력");
		Collections.shuffle(Arrays.asList(array));
		Prn(array);
		
	}
}
