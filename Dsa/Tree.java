package Dsa;

class Tree {
    Node head;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;//left and right are null as non-initialized variables are null in java but not in c++
        }
    }

    void inorder(Node head) {
        if (head != null) {
            inorder(head.left);
            System.out.print(head.data + " ");
            inorder(head.right);
        }
    }
    void preorder(Node head){
        if(head!=null){
            System.out.print(head.data + " ");
            preorder(head.left);
            preorder(head.right);
        }
    }

    void postorder(Node head){
        if(head!=null){
            preorder(head.left);
            preorder(head.right);
            System.out.print(head.data + " ");
        }
    }

    int getSize(Node head) {
        if (head == null) {
            return 0;
        }
        return 1+getSize(head.left)+getSize(head.right);
    }
}

class TreeDs {
    public static void main(String[] args) {
        Tree headnode = new Tree();
        Tree.Node one = new Tree.Node(1);
        headnode.head = one;

        Tree.Node two = new Tree.Node(2);
        one.left = two;

        Tree.Node three = new Tree.Node(3);
        one.right = three;

        Tree.Node four = new Tree.Node(4);
        two.left = four;
        /*

        tree structure  ->

                 1
              2       3
          4

        */


        headnode.inorder(headnode.head);
        System.out.println();
        headnode.preorder(headnode.head);
        System.out.println();
        headnode.postorder(headnode.head);
        System.out.println();
        System.out.println(headnode.getSize(headnode.head));

    }
}
