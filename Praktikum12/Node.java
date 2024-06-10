public class Node {
    int data;
    Node left, right;
    public Node next;
    
    public Node() {

    }

    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}