package com.revature.app;

public class ArrayList<T> {

	public Object[] internalArray;
	private int lastIndex;

	public ArrayList() {
		internalArray = new Object[10];
		lastIndex = 0;
	}

	public void add(T el) {

		if (lastIndex <= internalArray.length - 1) {
			internalArray[lastIndex] = el;
			lastIndex++;
		} else {
			Object[] newArray = new Object[internalArray.length + 1];
			for (int i = 0; i < internalArray.length; i++) {
				newArray[i] = internalArray[i];

			}
			lastIndex = internalArray.length;
			newArray[lastIndex] = el;
			lastIndex++;
			internalArray = newArray;
		}

	}

	public T get(int index) {
		return (T) internalArray[index];
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
