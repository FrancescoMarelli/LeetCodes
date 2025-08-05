import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Node {
    String value;
    Node parent;
    Node leftChild;
    Node rightChild;


    public void autoBuild() {
        this.setValue("1");

        // rightCHild
        Node rC = new Node();
        rC.setValue("2");
        rC.setParent(this);

        Node rRc = new Node();
        rRc.setParent(rC);
        rRc.setValue("3");
        rC.setRightChild(rRc);
        rC.setLeftChild(rRc);

        // LeftCHild
        Node lC = new Node();
        lC.setValue("4");
        lC.setParent(this);

        Node lLc = new Node();
        lLc.setParent(lC);
        lLc.setValue("5");
        lC.setRightChild(lLc);
        lC.setLeftChild(lLc);
        lC.setLeftChild(lLc);

        this.setRightChild(rC);
        this.setLeftChild(lC);
    }

    public void invert() {
        invert(this);
    }
    private void invert(Node node) {
        if (node.getLeftChild() != null && node.getRightChild() != null) { // es padre
            Node temp = node.getRightChild();
            node.setRightChild(node.getLeftChild());
            node.setLeftChild(temp);
            invert(node.getLeftChild());
            invert(node.getRightChild());
        } else if (node.rightChild == null && node.leftChild == null) {
            return;
        }

    }
}
