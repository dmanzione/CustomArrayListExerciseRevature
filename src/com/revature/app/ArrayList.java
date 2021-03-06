package com.revature.app;

public class ArrayList<T> {

	private Object[] internalArray;
	private int counter;

	public ArrayList() {
		internalArray = new Object[10];
		counter = 0;
	}
	
	public ArrayList(int size) {
		internalArray = new Object[size];
	}

	public void add(T el) {

		if (counter > internalArray.length - 1) {
			
			resize();
			
		} 
		internalArray[counter] = el;
		counter++;

	}
	
	private void resize() {
		
		Object[] newArray = new Object[internalArray.length + 1];
		for (int i = 0; i < internalArray.length; i++) {
			newArray[i] = internalArray[i];

		}
		counter = internalArray.length;
		
		internalArray = newArray;
	}

	public T get(int index) {

		return (T)internalArray[index];
	}
	
	public int getSize() {
		return counter;
	}

	public void replace(int index, T newThing) {
		internalArray[index] = newThing;
	}

	@Override
	public String toString() {
		String elementsInArrayList = "Elements: \n\t[\n";
		for (Object s : internalArray) {
			elementsInArrayList += "\t" + s + ",\n";

		}
		elementsInArrayList += "\t]";

		System.out.println(elementsInArrayList);
		return elementsInArrayList;
	}

}
