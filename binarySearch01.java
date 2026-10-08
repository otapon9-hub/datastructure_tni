import java.util.Scanner;

public class binarySearch01 {

	public static void main(String[] args) {
		int[] nums = sorting(new int[]{22, 11, 48, 10, 15, 29, 57, 23, 30});

		
		for(int num : nums) {
			System.out.print(num + " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.print("\ninput a target number: ");
		int target = input.nextInt();
		
		int index = binarySearch(nums, target);
		
		if(index != -1) {
			System.out.println("The target "+ target + " at index "+ index);
		}else {
			System.err.println("\nCannot found"+ target +"in this array");
		}

	}
	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}
	public static int binarySearch(int[] nums, int target) {
		
		int low = 0;
		int high = nums.length-1;
		
		while(low <= high) {
			int middle = (low+high)/2;
			
			if(target == nums[middle]) {
				return middle;
			}
			if(target < nums[middle]) {
				high = middle;
			} else {
				low = middle + 1;
			}
		}
		
		return-1;
	}

}

