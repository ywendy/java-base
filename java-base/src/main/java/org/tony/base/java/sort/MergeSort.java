package org.tony.base.java.sort;

public class MergeSort {

	public static void mergearray(int[] a, int first, int mid, int last, int[] temp) {

		int i = first, j = mid + 1;
		int m = mid, n = last;
		int k = 0;

		while (i <= m && j <= n) {
			if (a[i] <= a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}

		while (i <= m)
			temp[k++] = a[i++];

		while (j <= n)
			temp[k++] = a[j++];

		for (i = 0; i < k; i++)
			a[first + i] = temp[i];

	}

	static void mergesort(int a[], int first, int last, int temp[]) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergesort(a, first, mid, temp); // 左边有序
			mergesort(a, mid + 1, last, temp); // 右边有序
			mergearray(a, first, mid, last, temp); // 再将二个有序数列合并
		}
	}
	
	public static void main(String[] args) {
		int[] a = {20,8,56,3,45,26,12};
		int[] temp = new int[a.length];
		
		mergesort(a, 0, a.length-1, temp);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		
		
	}
	

}
