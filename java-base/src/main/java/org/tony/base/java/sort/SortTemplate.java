package org.tony.base.java.sort;

/**
 * 模板排序方法.
 * 
 * @author a
 *
 */
public abstract class SortTemplate {

	public abstract void sort(int[] array);

	/**
	 * 打印数组
	 * 
	 * @param array
	 */
	public void display(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}

	/**
	 * 交换a和b两个索引在数组中的位置，使a位置的数变成b，b位置的数变成a
	 * 
	 * @param a
	 * @param b
	 */
	public void swap(int a, int b, int[] array) {
		array[a] = array[a] ^ array[b];
		array[b] = array[a] ^ array[b];
		array[a] = array[a] ^ array[b];
	}

}
