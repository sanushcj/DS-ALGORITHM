public class doublyLinkedList {
    
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
        }

    }

    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode=new Node(data);

       
        if(head == null){
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        System.out.println("Added");
    }

    public void displayReverse(){
        Node temp=tail;
        if(tail == null){
            return;
        }
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }

    // public void delete(int data){
    //     Node temp=head,prev=null;
    //     if(temp != null && temp.data == data){
    //         temp.next=head;
    //     }

    //     while(temp != null && temp.data != data){
    //         prev=temp;
    //         temp=temp.next;
    //     }

    //     if(temp == null){
    //         return;
    //     }

    //    if(temp == tail){
    //       tail=prev;
    //       tail.next=null;
    //       return;
    //    }

    //    prev.next.next=temp.next.next;
    // }

    public void display(){
        Node temp=head;
        if(temp == null){
            System.out.println("Empty");
        }
        
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
           
        }
       
    }

    public static void main(String[] args) {
        doublyLinkedList List=new doublyLinkedList();

        List.display();

        List.addNode(34);
        List.addNode(90);
        List.addNode(23);
        List.addNode(11);

        List.display();
        // List.delete(34);
        // System.out.println("REVERSE");
        // List.displayReverse();
    }
}
