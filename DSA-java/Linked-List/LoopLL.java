package DSA.LinkedList;

public class LoopLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void add(int data) {

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

    void print() {
        Node newNode = head;
        while (newNode != null){
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }

    boolean isLoop(){

        Node slow = head;
        Node fast = head;

        while(slow != null && fast == null && fast.next != null){
            slow = slow.next;
            slow = slow.next.next;
            if(slow == fast){
                return true;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        LoopLL list = new LoopLL();

        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        list.print();


    }
}
