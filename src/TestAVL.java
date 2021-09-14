public class TestAVL {
    public static void main(String[] args) {
        AVL<Integer> AVL = new AVL<>();
        AVL.add(3);
        AVL.add(5);
        AVL.add(4);
        //System.out.println(AVL.root.getHeight());
        AVLNode<Integer> currNode = AVL.root;
        while (currNode != null){
            System.out.println(currNode.getHeight());
            currNode = currNode.getLeft();
        }
        System.out.println("Root = " + AVL.root.getData());
        System.out.println("Left = " + AVL.root.getLeft().getData());
        System.out.println("Right = " + AVL.root.getRight().getData());
    }
}