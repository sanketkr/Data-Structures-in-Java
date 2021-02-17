package com.company.Dsa;//most operation on stack is constant time
class Arraystack{
   private int[] a;
    private int size;
   private int head;

    Arraystack(int x){
        size=x;
        a=new int[size];
        head=-1;
    }
    void push(int x){
        if(head==size-1) System.out.println("overloaded");else{
            a[++head]=x;

        }

    }
    void peek(){
        if(head==-1) System.out.println("underflow");else{
            System.out.println(a[head]);
        }
    }
    void pop(){
        if(head==-1) System.out.println("underflow");else{
            System.out.println(a[head--]);
        }
    }
}
class LinkedListStack {
  Linkedlist.Node root=null;//using same Node class that used in linked list (ctrl+click on name to go there)
    // here we will push or pull from this node only we wont iterate to the last node
    // and that is the difference between linked list and  linkedlist_implementation_of_stack

    void push(int a){
        Linkedlist.Node newnode=new Linkedlist.Node(a);
        if(root==null) {
            root=newnode;
        }else {
            newnode.next=root;
            root=newnode;
        }
    }
   void pop(){
        if(root==null) System.out.println("empty");else{
            int temp = root.data;
            root =root.next;
            System.out.println(temp);
        }
    }
    void traverse(Linkedlist.Node root){
        if (root==null) return;else{
            System.out.println(root.data);
            traverse(root.next);
        }
    }
}
public class stack {
    public static void main(String[] args) {
//        Arraystack s1=new Arraystack(3);
//        s1.push(1);
//        s1.push(2);
//        s1.push(3);
//        s1.push(4);
//        s1.peek();
//
//        s1.pop();
//
//        s1.peek();
//
//
//        s1.pop();
//        s1.pop();
//
//        s1.peek();


//        LinkedListStack l1=new LinkedListStack();

//        l1.push(5);
//        l1.push(6);
//        l1.push(7);
//        l1.push(8);
//        l1.push(9);
//        l1.push(10);
//
//        l1.pop();
//        l1.pop();
//        l1.pop();
//
//        l1.traverse(l1.root);


    }
}
