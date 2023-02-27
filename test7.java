class Node {
    int data;
    Node Right;
    Node Left;

    Node(int value) {
        this.data = value;
        this.Right = null;
        this.Left = null;

    }

}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    void InOrder(Node node) {
        if (node == null) {
            return;
        }
        InOrder(node.Left);// Left;
        System.out.print(node.data + "\t");// Root ka data;
        InOrder(node.Right);// Right;

    }

    void PreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        PreOrder(node.Left);
        PreOrder(node.Right);

    }

    void PostOrder(Node node) {
        if (node == null) {
            return;
        }
        PostOrder(node.Left);
        PostOrder(node.Right);
        System.out.print(node.data + "\t");
    }

}

public class test7 {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.Left = new Node(2);
        t.root.Right = new Node(3);
        t.root.Left.Left = new Node(5);
        t.root.Left.Right = new Node(6);
        t.root.Right.Left = new Node(8);
        t.root.Right.Right = new Node(9);
        t.InOrder(t.root);
        System.out.println();
        t.PreOrder(t.root);
        System.out.println();
        t.PostOrder(t.root);

    }

}
