package com.test01;

public class MTest02 {
	public static void main(String[] args) {
		String str = "16진법으로 바꿉니다.";
		System.out.println(str);
		
		char[] buf = str.toCharArray();
		
		for (int i = 0; i < buf.length; i++) {
			System.out.println(Integer.toString(buf[i],16)+" ");
		}
	
	}
}
