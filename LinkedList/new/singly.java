
public class singly {
    public static void main(String[] args) {
        singly arraysss = new singly();
        arraysss.printAll();

        arraysss.addNode(2882);

        arraysss.addNode(20);

        arraysss.addNode(2882);

        arraysss.addNode(5);

        arraysss.addNode(42);

        arraysss.printAll();
        arraysss.deleteValue(42);
        arraysss.printAll();

    }

    public void deleteValue(int data) {
        Node prev = null, temp = head;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;

        }
        if (temp == null) {
            System.out.println("temp is null");
            return;
        }
        if (temp == tail) {
            tail = prev;
            tail.next = null;
            return;
        }

        prev.next = temp.next;

    }

    private void printAll() {
        Node temp = head;
        if (temp == null) {
            System.out.println("emptyyyy");
            return;
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        System.out.println("finished");
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insertAfter(int after, int data) {

        Node newnode = new Node(data);
        Node temp = head;

        while (temp != null && temp.data != after) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            tail.next = newnode;
            tail = newnode;
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

}
