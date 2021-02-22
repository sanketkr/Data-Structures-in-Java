package dsa;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
class Tree {
    Node head;
    int max=0;

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




    //  maximum  
    void maximum(Node head){
        if(head!=null){
            maximum(head.left);
            if(head.data>this.max)max=head.data;
            maximum(head.right);
        }
      
        System.out.println("max till now: "+this.max );       
    }


    int max(Node head){
        if(head==null)return Integer.MIN_VALUE;
        else
            return Math.max(head.data,Math.max(max(head.left),max(head.right))); 
    }
    /* recursive vs iterative
        which method to use will depend on type of binary trree
        - if tree is skewed then iterative method using a queue(level order) performs better then recursive
    */
    //


    void inorderWithoutRecursion(Node head){
        if(head==null)return;
        //look at the algorithm below(gfg) and try to code first
        //https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/


        
        
        
        
        
        
        Node current =head;
        Stack<Node> s=new Stack<>();
        
        while(current!=null || s.size()>0){
            // first reach leftest node
            while(current != null){
                s.push(current);
                current=current.left;
            }

            current=s.pop();
            System.out.println(current.data);

            current=current.right;

        }
        
    }

    void levelTraverse(Node head){
       
        Node current =head;

        Queue<Node> q=new LinkedList<>();
        
        /*
        ->> My Answer Code

         q.add(current);
         while(q.peek() != null){
            q.add(q.peek().left);
            q.add(q.peek().right);
          System.out.println(q.poll().data);
        }
        */


        /*

        ->>Standard Answer Code

        if(head==null)return;
        q.add(current);
        while(!q.isEmpty()){
            current=q.poll();
            System.out.println(current.data);

            if(current.left!=null)q.add(current.left);
            if(current.right!=null)q.add(current.right);

        }

        */
    }
}

class TreeDs {
    public static void main(String[] args) {
        Tree headnode = new Tree();
        Tree.Node one = new Tree.Node(1);
        headnode.head = one;

        Tree.Node two = new Tree.Node(2);
        one.left = two;

        Tree.Node three = new Tree.Node(30);
        one.right = three;

        Tree.Node four = new Tree.Node(4);
        two.left = four;
        /*

        tree structure  ->

                 1
              2       3
          4

        */


        // headnode.inorder(headnode.head);
        // System.out.println();
        // headnode.preorder(headnode.head);
        // System.out.println();
        // headnode.postorder(headnode.head);
        // System.out.println();
        // System.out.println(headnode.getSize(headnode.head));

       // headnode.inorderWithoutRecursion(headnode.head);
       //headnode.levelTraverse(headnode.head);
      System.out.println(headnode.max(headnode.head)); 

    }
}
