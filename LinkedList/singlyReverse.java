public class singlyReverse {
    
    class Node{
        int data;
        Node next;
        Node prev;
        

        Node(int data){
            this.data=data;
        }
    }

     Node head;
     Node tail;

     public void addNode(int data){
       Node newNode=new Node(data);

       if(head == null){
        head=newNode;
       }else{
        tail.next=newNode;
       }
       tail=newNode;

       System.out.println("Node Added");
     }

    public Node reverse(){
        
       Node current=head ;
       Node prev=null;
       Node next;

       while(current != null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
       }
       
       return prev;
    }

    public void display(){
        Node temp=head;

        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        singlyReverse list=new singlyReverse();
        
        list.addNode(34);
        list.addNode(21);
        list.addNode(78);
        list.addNode(1);

        list.display();
        System.out.println("aaaaaaaaaa");
        Node result=list.reverse();
        System.out.println(result);

        
    }
}
