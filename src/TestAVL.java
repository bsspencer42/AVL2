public class TestAVL {
    public static void main(String[] args) {
        AVL<Integer> AVL = new AVL<>();
        AVL.add(10);
        AVL.add(15);
        AVL.add(13);
        AVL.add(8);
        AVL.add(6);
        AVL.add(9);
        AVL.add(17);
        AVL.add(14);
        //System.out.println(AVL.root.getHeight());
        AVLNode<Integer> currNode = AVL.root;
        while (currNode != null){
            System.out.println(currNode.getHeight());
            currNode = currNode.getLeft();
        }
        AVL.remove(17);
        System.out.println("Root = " + AVL.root.getData());
        System.out.println("Left = " + AVL.root.getLeft().getData());
        System.out.println("Right = " + AVL.root.getRight().getData());
        System.out.println(AVL.size());
    }
}