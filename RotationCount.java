package BinarySearch;
//how many times a sorted array is rotated
public class RotationCount {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7};
		System.out.println(countRotations(arr));
	}
	static int countRotations(int[] arr) {
		int pivot = getPiviot(arr);
		int rotations = pivot +1; //only change to get rotations
		return rotations;
		
	}
	static int getPiviot(int[] arr){
        int start=0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid+1]<arr[mid]){
                return mid;
            }if(mid>start && arr[mid-1]> arr[mid]){
                return mid-1;
            }if(arr[start]>arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }

	
}
