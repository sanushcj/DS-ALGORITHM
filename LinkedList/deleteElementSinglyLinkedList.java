public class deleteElementSinglyLinkedList {
    
    class Node{
        int data;
        Node next;
    

    Node(int data){
        this.data=data;
    }
}

public Node head=null;
public Node tail=null;


  public void addNode(int data){
     Node newNode=new Node(data);

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

  public void  delete(int data){
    Node temp=head,prev=null;
    
//deleting from head
    if(temp != null && temp.data == data){
        head=temp.next;
        return;
    }
//deleting from center
    while(temp != null && temp.data !=  data){
        prev=temp;
        temp=temp.next;
    }
//checking when temp == null
    if(temp == null){
        return;
    }
//checking if last element is deleted
    if(temp == tail){
        tail=prev;
        tail.next=null;//to break the connection
        return;
    }

    prev.next=temp.next;
  }

  public void insertAfter(int nextTo,int data){
    Node newNode=new Node(data);
    Node temp=head;

    while(temp != null && temp.data != nextTo){
        temp=temp.next;
    }

    if(temp == null){
        return;
    }

    if(temp == tail){
        tail.next=newNode;
        tail=newNode;
    }

    newNode.next=temp.next;
    temp.next=newNode;
  }

  public static void main(String[] args) {
    deleteElementSinglyLinkedList deleteList=new deleteElementSinglyLinkedList();
    deleteList.display();

    deleteList.addNode(45);
    deleteList.addNode(56);
    deleteList.addNode(12);
    deleteList.addNode(32);
    deleteList.addNode(57);

    deleteList.display();

System.out.println("sssssssssssssssss");
    deleteList.delete(45);
deleteList.insertAfter(12, 90);

    deleteList.display();

  }
}
