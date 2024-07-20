package DSA.LinkedList;

public class TimePass2 {

        Node head;
        class Node{

            int data;
            Node next;

            Node(int data){
                this.data = data;
                next = null;
            }
        }

        void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
            currNode.next.next = head;
        }


        void print(){
            Node currNode = head;
            while (currNode !=  null){
                System.out.print(currNode.data + " => ");
                currNode = currNode.next;
            }
        }


    public static void main(String[] args) {

            TimePass2 list = new TimePass2();

            list.add(4);
            list.add(4);
            list.add(4);
            list.add(4);
            list.add(4);
            list.print();
    }
}
