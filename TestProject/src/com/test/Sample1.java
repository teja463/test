package com.test;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Hello World..");
		List<String> list = new ArrayList<String>(){{add("1");add("2");add("Three");}};
		for(String s : list){
			System.out.println("The Strig value is "+s);
		}
	}

}
