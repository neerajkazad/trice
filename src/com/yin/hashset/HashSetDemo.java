package com.yin.hashset;

import java.util.HashSet;

/**
 * This is the Sample HashSet program.
 * 
 */
public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}
