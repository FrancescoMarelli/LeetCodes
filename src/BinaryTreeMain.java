public class BinaryTreeMain {

   public static void main (String [] s) {
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
