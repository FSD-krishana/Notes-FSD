package DSA.LinkedList;

class TimePass {

    Node head;
    Node tail;

    class Node {
        int data;
        Node pre;
        Node next;

        Node(int data) {
            this.data = data;
            pre = null;
            next = null;
        }
    }


    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.pre = currNode;
        tail = newNode;
    }


    void print() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    void reverse() {
        Node currNode = tail;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.pre;
        }
    }

    void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.pre = newNode;
        head = newNode;
    }


    void delete() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node lastNode = tail;
        Node newLast = lastNode.pre;
        newLast.next = null;
        lastNode.pre = null;
        tail = newLast;
    }


    void deleteFirst(){
        if(head == null)
            return;
        if(head.next == null){
            head = null;
            return;
        }
        Node newNode = head;
        head = newNode.next;
        head.pre = null;
    }

    public static void main(String[] args) {

        TimePass list = new TimePass();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.addFirst(0);


        list.print();
        list.delete();
        System.out.println();
        list.print();
        System.out.println();
        list.reverse();

    }
}
