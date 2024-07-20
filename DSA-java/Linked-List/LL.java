package DSA.LinkedList;
class Node {

    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class Node2 {
    String data;
    Node2 next;

    Node2(String data) {
        this.data = data;
        next = null;
    }
}

public class LL {

    int size = 0;

    // HEAD Starting Point

    Node head;

    Node2 head2;

    LL() {
        head = null;
        head2 = null;
    }

    // Element At the End

    void AddLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Element at First

    void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print List element
    void printList() {
        Node last = head;
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.next;
        }
    }

    // Size of LinkedList

    int size() {
        return size;
    }

    //Reversed  LinkedList

    void reversLinkedList() {

        if (head == null || head.next == null)
            return;

        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            // update

            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    // LinkedList is Palindrome or not

    void palindrome() {

        if (head == null || head.next == null) {
            System.out.println("String Is Palindrome");
            return;
        }

        Node last = head;
        int count = 0;
        int linkedListSize = size;
        boolean ans = true;
        String[] check = new String[linkedListSize];

        while (last != null) {
            check[count] = last.data;
            last = last.next;
            count++;
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i].equals(check[linkedListSize - 1])) {
                ans = true;
            } else {
                ans = false;
                break;
            }
            linkedListSize--;
        }

        if (ans)
            System.out.println("LinkedList is Palindrome");
        else
            System.out.println("LinkedList Not is Palindrome");
    }

    // Sum of Linked list element

    void sum() {

        StringBuilder sc = new StringBuilder();
        // int sum = 0;
        Node last = head;

        while (last != null) {
            sc.append(last.data);
//            sum +=last.data
            last = last.next;
        }
        System.out.println(sc);
    }


    // For second Linked List

    void addfirstNode2(String data) {
        Node2 newNode = new Node2(data);
        if (head2 == null) {
            head2 = newNode;
            return;
        }
        newNode.next = head2;
        head2 = newNode;
    }

    boolean newPalindrome() {

        Node last = head;
        while (last != null) {
            addfirstNode2(last.data);
            last = last.next;
        }

        Node first = head;
        Node2 second = head2;

        while (first != null) {
            if (first.data != second.data)
                return false;
            first = first.next;
            second = second.next;
        }

        return true;

    }

    // Print List element
    void printList2() {
        Node2 last = head2;
        while (last != null) {
            System.out.println(" List 2 " + last.data + " ");
            last = last.next;
        }
    }


    public static void main(String[] args) {

        LL list = new LL();

        list.AddLast("A");
        list.AddLast("A");
        list.AddLast("B");
        list.AddLast("A");
        list.AddLast("A");

        list.printList();
//        System.out.println("Size of LinkedList " + list.size());
//
//        list.reversLinkedList();
//        list.printList();
//        list.sum();
        System.out.println("New List");
        list.printList2();
        System.out.println(list.newPalindrome());



    }
}
