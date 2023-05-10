public class sumSinglyLinkedList {
    
    class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
        }
    }

     Node head;
     Node tail;

    public void addNode(int data){
        Node newNode=new Node(data);

        Node temp=head;

        if(temp == null){
            temp=newNode;
        }else{
            tail.next=newNode;
        }

        tail=newNode;
        System.out.println("Added");
    }

    public int sum(){
       Node temp=head;
        int sum=0;
        
        while(temp != null){
         sum=sum + temp.data;
         temp=temp.next;
         
        
        }
        
        return sum; 
    }

    // public int sample(){
    //     int sum1=0;
    //     int i=0;
    //     while(i <= 10){
    //         sum1 =sum1 + i;
    //         i++;
    //     }
    //     return sum1;
    // }

    public static void main(String[] args) {
      sumSinglyLinkedList List=new sumSinglyLinkedList();

      List.addNode(45);
      List.addNode(1);
      List.addNode(78);
      List.addNode(89);

      int s=List.sum();
      System.out.println(s);

    //   int res=List.sample();
    //   System.out.println(res);
    }

    
}
