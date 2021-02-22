package dsa;
class Linkedlist {
    Node head;


    static class Node { //static class tutorial:https://www.programiz.com/java-programming/nested-inner-class
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;//optional , anyway it is null if uninitialized
        }
    }

    void insertionBegin(int x) {
        Node newnode = new Node(5);

        Node temp = head;
        head = newnode;
        newnode.next = temp;
    }

    void insertionEnd(int x) {
        Node newnode = new Node(5);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void traverseRecursive(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        traverseRecursive(head.next);


    }

    void searchRecursive(Node head, int a) {

        if (head == null) return;
        if (head.data == a) {
            System.out.println("found " + head.data);
            return;
        }

        searchRecursive(head.next, a);


    }

    //<> - this sign represent there are more than one related comment, look for next number for the related comment
    void middleNode(Node head) {  //<n1> naive solution
        if (head == null) return;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middle = (count / 2 + 1);           //<c1> dekho yahan jo 1 add kiya h agar iske jagah pr
        System.out.println("middle node is :" + middle);
        temp = head;
        for (int i = 1; i < middle; i++) {                 //<c2> loop zero se shuru karen to same baat h lekin ek addition operation mein time bachega, so keep in mind
            temp = temp.next;
        }
        System.out.println("middle data is :" + temp.data);


    }

    void slowFastPointer(Node head) { //<n1> here we traverse only once to find middle node so better solution, gfgvideoNo-14 of stack
        if (head == null) return;
        Node slow = head, fast = head; //slow,fast=head      -remember only fast is initialised  here
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    Node efficientReverse(Node head){
        Node curr=head,prev=null;
        while(curr!=null){
            Node next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;//new head

        //below was my code first try:)
//        Node prev=head,current=prev.next,next=current.next;
//        while (next!=null){
//            current.next=prev;
//            prev=current;
//            current=next;
//            next=current.next;
//        }
//        current.next=prev;
//        head.next=null;
//        return current;
    }
}
public  class List {      //why is this static? try removing static keyword from here, observe the error in ide.
    public static void main(String[] args) {
        Linkedlist headnode=new Linkedlist();//we used nested classes so that there is only one head

        Linkedlist.Node node1 =new Linkedlist.Node(1);//first node
        headnode.head=node1;                             //connect to the first node.
        Linkedlist.Node node2 =new Linkedlist.Node(2);//2nd node
        node1.next=node2;
        Linkedlist.Node node3 =new Linkedlist.Node(3);//2nd node
        node2.next=node3;
        Linkedlist.Node node4 =new Linkedlist.Node(4);//2nd node
        node3.next=node4;


        headnode.head=headnode.efficientReverse( headnode.head);
       headnode.traverseRecursive(headnode.head);



    }



}
