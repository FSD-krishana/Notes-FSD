package DSA.LinkedList;

class NodeInt {
    int data;
    NodeInt next;

    NodeInt(int data) {
        this.data = data;
        next = null;
    }
}


public class LinkedListInt {
    NodeInt head;
    int len = 0;

    LinkedListInt() {
        head = null;
    }

    // Add element
    void addFront(int data) {
        NodeInt newNode = new NodeInt(data);
        len++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // Add Element at last
    void addLast(int data) {
        NodeInt newNode = new NodeInt(data);
        len++;
        if (head == null) {
            head = newNode;
            return;
        }
        NodeInt currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // Print Integer

    void listLinkList() {
        NodeInt currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    // Add Element at any point

    void addAtAnyPoint(NodeInt pre, int data) {

        NodeInt newNode = new NodeInt(data);
        len++;
        if (pre.next == null) {
            return;
        }
        newNode.next = pre.next;
        pre.next = newNode;

    }

    // Length of linkedList

    void size() {
        System.out.println("Size of linkedList " + len);
    }

    // Delete Last Element

    void DeleteLastElement(){

        NodeInt currNode =head;
        while (currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next  = null;

    }

    // Delete First Element

    void deleteFirstElement(){
        NodeInt currNode = head;
        head = currNode.next;
    }


    public static void main(String[] args) {
        LinkedListInt list = new LinkedListInt();
        list.addFront(1);
        list.addFront(2);
        list.addFront(3);
        list.addFront(4);
        list.addLast(5);
        list.addFront(6);
        list.listLinkList();
        NodeInt preNode = list.head.next.next.next;
        System.out.println();
        list.addAtAnyPoint(preNode, 0);
        list.listLinkList();
        System.out.println(" After ");

        list.DeleteLastElement();

        list.listLinkList();
        System.out.println();
        list.size();

    }


}
