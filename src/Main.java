public class Main {
    public static void main (String[]args) {
//        LinkedList linkedList = new LinkedList (4);
//
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
        // linkedList.printList();
        LinkedList linkedList = new LinkedList (1);

        linkedList.append(2);
        // (2) Items - return 2 Node
        System.out.println(linkedList.removeLast());
        // (1) Items - return 2 Node
        System.out.println(linkedList.removeLast());
        // (0) Items - return 2 Node
        System.out.println(linkedList.removeLast());

    }
}
