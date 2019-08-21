package cn.zsy.algorithm.sort;

/**
 * 选择排序
 */
public class SelectSortDemo {

	public static void main(String[] args) {
		int[] arr = {24 , 69 , 80 , 57 , 13} ;

		System.out.print("排序前: ");
		BubbleSortDemo.print(arr) ;

		// 排序
		selectSort2(arr) ;

		// 遍历
		System.out.print("排序后: ");
		BubbleSortDemo.print(arr) ;

	}
	// 选择排序
	private static void selectSort2(int[] arr) {
		//
		for(int index = 0 ; index < arr.length - 1 ; index++) {
			for(int x = index + 1 ; x < arr.length ; x++) {
				if(arr[index] > arr[x]) {
					int temp = arr[index] ;
					arr[index] = arr[x] ;
					arr[x] = temp ;
				}
			}
		}

	}


	// 选择排序的推导过程
	private static void selectSort(int[] arr) {

		// 第一次比较
		int index = 0 ;
		for(int x = index + 1 ; x < arr.length ; x++) {
			if(arr[index] > arr[x]) {
				int temp = arr[index] ;
				arr[index] = arr[x] ;
				arr[x] = temp ;
			}
		}

		// 第二次比较
		index = 1 ;
		for(int x = index + 1 ; x < arr.length ; x++) {
			if(arr[index] > arr[x]) {
				int temp = arr[index] ;
				arr[index] = arr[x] ;
				arr[x] = temp ;
			}
		}

		// 第三次比较
		index = 2 ;
		for(int x = index + 1 ; x < arr.length ; x++) {
			if(arr[index] > arr[x]) {
				int temp = arr[index] ;
				arr[index] = arr[x] ;
				arr[x] = temp ;
			}
		}

		// 第四次比较
		index = 3 ;
		for(int x = index + 1 ; x < arr.length ; x++) {
			if(arr[index] > arr[x]) {
				int temp = arr[index] ;
				arr[index] = arr[x] ;
				arr[x] = temp ;
			}
		}


	}
}
