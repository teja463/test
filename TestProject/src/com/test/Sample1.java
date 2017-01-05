package com.test;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Hello World..");
		List<String> list = new ArrayList<String>(){{add("One");add("Two");add("Three");}};
		for(String s : list){
			System.out.println(s);
		}
	}

}
