package com.manoj.java.test;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetTask {
	public static void main(String[] args) {
		Set<Integer> setInpts = new HashSet<>();
		setInpts.add(10);
		setInpts.add(80);
		setInpts.add(70);
		setInpts.add(60);
		setInpts.add(50);
		setInpts.add(40);
		setInpts.add(30);
		setInpts.add(20);
		setInpts.stream().forEach(m->System.out.println(m));
	}
}
