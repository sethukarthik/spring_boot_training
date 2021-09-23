package binary_search;

public class TargetElement {

	public static void main(String[] args) {
		int[] nums = {1,2,5,7,8,9,13,14,21};
		int target = 22;
		System.out.println(binarySearch(nums, target));
	}
	
	public static int binarySearch(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < nums[mid]) {
				end = mid - 1;
			}else if(target > nums[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
}