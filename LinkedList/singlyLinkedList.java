public class singlyLinkedList {
    
    class Node{
        int data;
        Node next;
        //Node prev;
    

        Node(int data){
            this.data=data;
        }
}

 Node head;
 Node tail;

public void addNode(int data){
    Node newNode=new Node(data);
    System.out.println(newNode);
     
    if(head == null){
        head=newNode;
    }else{
        tail.next=newNode;
    }
    tail=newNode;

    System.out.println("New Node Added");
}

public void display(){
    if(head == null){
        System.out.println("Empty List");
        return;
    }

    Node temp=head;

    while(temp != null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}



public static void main(String[] args) {
    singlyLinkedList list=new singlyLinkedList();
   
    list.addNode(10);
    list.addNode(20);
    list.addNode(30);
    list.addNode(40);

    list.display();
    
}



}
