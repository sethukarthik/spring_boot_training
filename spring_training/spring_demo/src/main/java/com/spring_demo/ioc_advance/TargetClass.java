package com.spring_demo.ioc_advance;

import java.util.ArrayList;
import java.util.List;

public class TargetClass {
	
	static List list;
	
	
	public static List getList() {
		System.out.println("Coming to getList");
		list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		return list;
	}
}
