package com.test02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MTest02 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "밀로");
		hm.put("addr", "Toronto");

		System.out.println("전체출력 : " + hm);

		System.out.println("\n entrySet()을 이용한 View");
		Set<Entry<String, String>> entires = hm.entrySet();
		for (Entry<String, String> ent : entires) {
			System.out.println(ent.getKey() + " ===> " + ent.getValue());
		}

		System.out.println("\n keySet()을 이용한 View");
		Set<String> keys = hm.keySet();
		for (String k : keys) {
			System.out.println("Value of " + k + " is : " + hm.get(k));
		}

		System.out.println("\n values()를 이용한 View");
		Collection<String> value = hm.values();
		for (String val : value) {
			System.out.println("value is : " + val);
		}

		System.out.println("\n 키와 값을 찾아서 값을 변경");
		if (hm.containsKey("addr") && hm.containsValue("Toronto")) {
			hm.replace("addr", "Canada");
		}
		System.out.println(hm);
	}
}
