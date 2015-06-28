package org.tony.base.java.sort;

/**
 * 冒泡排序. 冒泡排序的时间复杂度为O(n^2),是一种稳定排序，在数据量不是很大的情况下可以选择此排序，比较容易理解.
 * 
 * @author a
 *
 */
public class BubbleSort extends SortTemplate {

	@Override
	public void sort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {// 前面的数小，进行交换，进行降序排列
					swap(j, j + 1, array);
				}
			}
		}

	}

	public static void main(String[] args) {
		SortTemplate bubble = new BubbleSort();
		int[] array = { 2, 8, 5, 6, 3, 0, 9, 10 };
		bubble.sort(array);
		bubble.display(array);
	}

}
