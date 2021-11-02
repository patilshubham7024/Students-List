package com.te.arraylistimpl;

import java.util.Iterator;

public class MyArrayList implements Iterable{
	private Object[] array;
	private int position;

	public MyArrayList(int arraySize) {
		array = new Object[arraySize];
	}

	void remove(int index) {
		Object temp;
		temp= array;
		for (int i = 0; i < array.length && i!= index; i++) {
			array[index] = array[index++];
		}
		
	}

	public void add(Object object) {
		if (position >= size()) {
			grow();
		}
		array[position++] = object;
	}

	public int size() {
		return this.position;
	}

	public Object get(int index) {
		return array[index];
	}

	@Override
	public String toString() {
		if (size() == 0) {
			return "";
		}
		String string = "[ " + array[0];
		for (int i = 1; i < size(); i++) {
			string += ", " + array[i];
		}
		string += " ]";
		return string;
	}

	private void grow() {
		Object[] temp = new Object[array.length << 1];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}

	@Override
	public Iterator iterator() {
		return new MyItr();
	}

	private class MyItr implements Iterator {
		int index;

		public boolean hasNext() {
			return position > index;
		}

		public Object next() {
			return array[index++];
		}
	}
}