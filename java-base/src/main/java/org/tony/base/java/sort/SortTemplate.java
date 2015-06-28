package org.tony.base.java.sort;

public abstract class SortTemplate {

	public abstract void sort(int[] array);

	public void display(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}

}
