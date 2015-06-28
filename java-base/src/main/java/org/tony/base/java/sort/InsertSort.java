package org.tony.base.java.sort;

public class InsertSort extends SortTemplate {

	@Override
	public void sort(int[] array) {
		System.out.println("------------insert sort begin!-------------");
		
		
		
		  for (int i = 1; i < array.length; i++)
          {
              if (array[i - 1] > array[i])
              {
                  int temp = array[i];
                  int j = i;
                  while (j > 0 && array[j - 1] > temp)
                  {
                	  array[j] = array[j - 1];
                      j--;
                  }
                  array[j] = temp;
              }
          }
	
		display(array);
		System.out.println("------------insert sort end!-------------");

	}

	public static void main(String[] args) {

		SortTemplate sort = new InsertSort();
		int[] array = { 18, 44, 56, 2, 89, 0, 1, 32 };
		System.out.println("--------排序前--------");
		sort.display(array);

		sort.sort(array);

	}

}
