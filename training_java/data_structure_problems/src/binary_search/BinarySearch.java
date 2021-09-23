package binary_search;

public class BinarySearch {
	
	public static int findElementUsingBinary(int target) {
		int[] binary = {1,2,4,6,8,9,12,19,24,30};
		int start = 0;
		int end = binary.length - 1;
		
		boolean isAsc;
		isAsc = binary[start] < binary[end];
	
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target == binary[mid]) {
				return binary[mid];
			}
			
			if(isAsc) {
				if(target > binary[mid]) {					
					start = mid+1;
				} else {
					end = mid-1;
				}
			} else {
				if(target > binary[mid]) {					
					start = mid-1;
				}else {
					end = mid+1;
				}
			}
		}
		return -1;
	}
	
	public static int findCeilieng(int[] arr, int target) {
		int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return arr[mid];
            }
        }
        return arr[start];
	}
	
	public static int findfloor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
		
			if(target < arr[mid]) {					
				end = mid-1;
			} else if( target > arr[mid]) {
				start = mid+1;
			} else {
				return arr[mid];
			}
		}
		return arr[end];
	}
	
	public static char findLargestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
		
			if(target < letters[mid]) {					
				end = mid-1;
			} else if( target > letters[mid]) {
				start = mid+1;
			} else {
				return letters[mid];
			}
		}
		System.out.println(start % letters.length);
		return letters[start % letters.length];
	}
	
	public static int[] findOccurance(int[] arr, int target) {
		
		int[] result = {-1, -1};
		
		result[0] = searchIndex(arr, target, true);
		if(result[0] != -1) {			
			result[1] = searchIndex(arr, target, false);
		}
		
		return result;
		
	}
	
	public static int searchIndex(int[] arr, int target, boolean firstIndex) {
		int start = 0;
		int end = arr.length - 1;
		int result = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
		
			if(target < arr[mid]) {					
				end = mid-1;
			} else if( target > arr[mid]) {
				start = mid+1;
			} else {
				result = mid;
				if(firstIndex) {					
					end = mid-1;
				}else {
					start = mid + 1;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
//		System.out.println(findElementUsingBinary(2));		
//		System.out.println(findCeilieng(new int[] {2,3,5,9,14,16,18}, 14));	
//		System.out.println(findfloor(new int[] {2,3,5,9,14,16,18}, 5));	
//		System.out.println(findLargestLetter(new char[] {'c', 'f', 'j'}, 'd'));	
//		System.out.println(findOccurance(new int[] {5,7,7,8,8,9,10}, 8));	
		int i = 10;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(i+1);
		System.out.println(i);
		
	}
	
}