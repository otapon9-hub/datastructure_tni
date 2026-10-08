import java.util.Scanner;
import java.util.ArrayList;

public class linearSearch03 {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.sampleTree();

        tree.printTree(tree.getRoot(), 0);

        ArrayList<Integer> list = traversal(tree.getRoot());

        int[] nums = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        System.out.print("\nTraversal order : ");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\n\ninput a target number: ");
        int target = input.nextInt();

        int index = linearSearch(nums, target);

        if (index != -1) {
            System.out.println("The target " + target + " at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this tree");
        }
    }

    	public static ArrayList<Integer> traversal(Node root) {
    	    ArrayList<Integer> result = new ArrayList<Integer>();

    	    if (root != null) {
    	        result.add(root.data);
    	        result.addAll(traversal(root.left));
    	        result.addAll(traversal(root.right));
    	    }

    	    return result;
    	}

public static int linearSearch(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
        if (target == nums[i]) {
            return i;
        }
    }

    return -1;
    }
}
