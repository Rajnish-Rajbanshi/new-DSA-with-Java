public class DoublyLinkedList {
    class Node{
        Node prev;
        Node next;
        int data;
        Node(int data){
            this.data=data;
            prev=next=null;
        }
    }
    private Node head,tail;

    public DoublyLinkedList() {
        head=tail=null;
    }
    
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        } else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.display();
    }

}
