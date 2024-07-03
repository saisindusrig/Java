package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {1,4,3,5,2};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void bubble (int[] arr) {
		boolean swaped;
		for(int i=0;i<arr.length;i++) {
			swaped = false;
			
			
			//for each step, max item will be at last index
			for (int j=1;j<arr.length-i;j++) {
				//swap is item is smaller than previous
				if (arr[j]<arr[j-1]){
					//swap
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swaped =true;
				}
			}
			//if not swapped for particulaar i, arr is sorted
			if(!swaped) { 
				break;
			}
		}
	}
}
