package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<>();
		
		
		myArrayList.add("hello1");
		myArrayList.add("hello2");
		myArrayList.add("hello3");
		myArrayList.add("hello4");
		myArrayList.add("hello5");
		myArrayList.add("hello6");
		myArrayList.add("hello7");
		myArrayList.add("hello8");
		myArrayList.add("hello9");
		myArrayList.add("hello10");
		myArrayList.add("hello11");
		
		
		
		myArrayList.replace(6, "goodbye7");
		myArrayList.toString();

		System.out.println(myArrayList.get(10));
		
		
		
		ArrayList<Integer> myArrayList2 = new ArrayList<>();
		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(3);
		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(3);
		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(3);
		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(3);
		
		myArrayList2.toString();
		
		
	}

}
