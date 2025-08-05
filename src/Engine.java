public class Engine {

    public static void main(String[] s) {
//        Integer[] unsorted = new Integer[]{5,4,3,11,1,32,4,7,77,3,2,6,7,44,3};
//        //Integer[] sorted = SortigAlgorithms.bubbleSort(unsorted);
//        Integer[] sorted = SortigAlgorithms.quickSort(unsorted);
//        for (Integer integer : sorted)
//            System.out.print(integer + " ");
//
//        System.out.println();

        Node binaryTree = new Node();
        binaryTree.autoBuild();

        binaryTree.invert();

        System.out.println("parent " + binaryTree.value);
        System.out.println("leftChild " + binaryTree.getLeftChild().value);
        System.out.println("rightChild " + binaryTree.getRightChild().value);
        System.out.println("rightChild left son " + binaryTree.getRightChild().getLeftChild().value);
        System.out.println("rightChild right son " + binaryTree.getRightChild().getRightChild().value);
        System.out.println("leftSide left son " + binaryTree.getLeftChild().getLeftChild().value);
        System.out.println("leftSide right son " + binaryTree.getLeftChild().getRightChild().value);
    }



}
