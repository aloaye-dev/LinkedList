import org.w3c.dom.Node;

public class LinkedList {


        private Node head;
        private Node tail;
        private int length;



    class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        public LinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }
        public void printList(){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.value);
                temp= temp.next;
            }
        }

        public void getHead(){
            System.out.println("Head : " + head.value);
        }

        public void getTail(){
            System.out.println("Tail : " + tail.value);
        }
        public void getLength(){
            System.out.println("Length: " + length);
        }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail= newNode;
        }
        length ++;
    }
    // why do we use a peremeter in java?? when to use static void
    public Node removeLast(){
            if (length == 0) return null;
            Node temp = null;
            Node pre = null;
            while (temp.next != null){
                pre = temp;
                temp= temp.next;
            }
            tail = pre;
            tail.next = null;
            length --;
            if (length == 0){
                head= null;
                tail = null;
            }
            return temp;
    }
}

