package DSA.LinkedList;

public class LinkedListPractice {
    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add - First,Last Element

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add - Last

    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    // print

    public void printList() {

        if (head == null)
            System.out.println("NULL List");

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    // Reverse LinkedList

    public void reverseIterater() {

        if (head == null || head.next == null)
            return;

        Node preNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            // Update

            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    public Node reverseRecursive(Node head){

        if(head == null || head.next==null)
            return head;

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;

    }

    public static void main(String[] args) {

        LinkedListPractice list = new LinkedListPractice();

        list.addFirst("2");
        list.addFirst("1");
        list.addlast("3");
        list.addlast("4");

        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
