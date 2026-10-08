import java.util.Scanner;

public class jumpSearch01 {

	public static void main(String[] args) {
int[] nums = sorting(new int[]{22, 11, 48, 10, 15, 29, 57, 23, 30});

		
		for(int num : nums) {
			System.out.print(num + " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.print("\ninput a target number: ");
		int target = input.nextInt();
		
		int index = jumpSearch(nums, target);
		
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
	public static int jumpSearch(int[] nums, int target) {
		int jump_size =(int) Math.floor(Math.sqrt(nums.length));
		
		int start = 0;
		int m = nums.length-1;
		
		 while (m < nums.length){
			 if(target == nums[m])
					return m;
			 else if (target > nums[m]) {
		 }else {
			 for(int i=start; i<m; i++) {
				 if(target == nums[i])
					 return i;
			 }
		 }
			 for(int i=start; i<nums.length; i++) {
				 if(target == nums[i])
					 return i;
			 }
}
		    return -1;
}
}
