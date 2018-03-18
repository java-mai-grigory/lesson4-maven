package lesson3.MyCollection;

public class LinkedList {

    Node root = null;

    void add(Integer val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
        } else {
            Node last = root;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    boolean isEmpty() {
        return size() == 0;
    }

    int size() {
        if (root == null) {
            return 0;
        }
        int counter = 0;
        Node current = root;
        do {
            counter++;
        } while ((current = current.next) != null);
        return counter;
    }

    void printAll() {
        if (root == null) {
            System.out.println("list is empty");
        } else {
            Node current = root;
            do {
                System.out.println(current.value);
            } while ((current = current.next) != null);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.printAll();
        System.out.println("size = " + list.size());
    }

}
