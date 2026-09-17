
public class TreeApp2 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree4()");
        System.out.println("------------------------------");
        tree.createTree4();
        tree.printTree(tree.getRoot(), 0);

        tree = new BinaryTree();

        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------");
        tree.createTree5();
        tree.printTree(tree.getRoot(), 0);

        tree = new BinaryTree();

        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree6()");
        System.out.println("------------------------------");
        tree.createTree6();
        tree.printTree(tree.getRoot(), 0);
    }
}