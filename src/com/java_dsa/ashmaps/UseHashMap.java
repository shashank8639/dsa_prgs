package com.java_dsa.ashmaps;

public class UseHashMap {

	public static void main(String[] args) {

		MyhashMap<String, Integer> map = new MyhashMap<>();
		
		map.put("abc", 11);
		map.put("def", 12);
		map.put("ghi", 13);
		map.put("jkl", 14);
		map.put("mno", 15);
		
		System.out.println(map);
		System.out.println("=========================");
		System.out.println(map.get("abc")); // 20 
		System.out.println(map.containsKey("def")); // true
		map.remove("def"); 
		System.out.println(map.containsKey("def")); // false 
		System.out.println("Size = " + map.size()); // 
		System.out.println("===================");
		System.out.println(map);
	}

}
