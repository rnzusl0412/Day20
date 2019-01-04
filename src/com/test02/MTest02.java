package com.test02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MTest02 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "�з�");
		hm.put("addr", "Toronto");

		System.out.println("��ü��� : " + hm);

		System.out.println("\n entrySet()�� �̿��� View");
		Set<Entry<String, String>> entires = hm.entrySet();
		for (Entry<String, String> ent : entires) {
			System.out.println(ent.getKey() + " ===> " + ent.getValue());
		}

		System.out.println("\n keySet()�� �̿��� View");
		Set<String> keys = hm.keySet();
		for (String k : keys) {
			System.out.println("Value of " + k + " is : " + hm.get(k));
		}

		System.out.println("\n values()�� �̿��� View");
		Collection<String> value = hm.values();
		for (String val : value) {
			System.out.println("value is : " + val);
		}

		System.out.println("\n Ű�� ���� ã�Ƽ� ���� ����");
		if (hm.containsKey("addr") && hm.containsValue("Toronto")) {
			hm.replace("addr", "Canada");
		}
		System.out.println(hm);
	}
}
