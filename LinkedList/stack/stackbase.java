

class Stack {

    class Node {
        int data;
        Node next;

Node(int data){
this.data = data;
}

    }

    public Node top;

public void addElement(int data){

Node newNode = new Node(data);
if(top==null){
    top = newNode;
}else{
    newNode.next = top;
    top =newNode;
}
} 

public void display(){
    Node current = top;
    if (top==null) {
System.out.println("Stack underflow");    }else{
    while (current.next!=null) {
        System.out.println(current.data);
        current= current.next;
    }
}
}
public static void main(String[] args) {
    Stack obj = new Stack();
    obj.addElement(5);
    obj.addElement(10);

    obj.addElement(20);

    obj.addElement(25);

    obj.addElement(35);

    obj.addElement(45);
    obj.display();

}
}