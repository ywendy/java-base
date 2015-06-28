package org.tony.base.java.search;

public class BinarySearch {

	/**
	 * 从给定的数组中找到t所在的位置. 也可以判断t是否在数组中.<strong> 二分查找讲究的是，给定的数组必须是有序的，不然是无法进行二分查找的.</strong>
	 * 
	 * @param array
	 * @param t
	 * @return
	 */
	public static int search(int[] array, int t) {

		int low = 0;
		int height = array.length - 1;
		while (low <= height) {
			int mid = (low + height) / 2;
			if (array[mid] > t) {// 比t大 说明要查左边
				height = mid - 1;
			} else if (array[mid] < t) {// 右边.
				low = mid + 1;
			} else {
				return mid; // 相等，直接返回t的索引.
			}
		}

		return -1;// 没有找到给定的t

	}

	public static void main(String[] args) {
		int[] array = { 2, 5, 6, 9, 20, 23 };

		System.err.println(search(array, 6));
	}

}
