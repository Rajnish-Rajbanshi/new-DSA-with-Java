
public class DoublyCircularLL {
    class Node{
        Node next,prev;
        int data;
        Node(int data){
            this.data=data;
            this.prev=this.next=null;
        }
    }
    private Node head,tail;

    public DoublyCircularLL() {
        head=tail=null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.prev=head.next=tail.prev=tail.next=newNode;
        } else{
            tail.next=newNode;
            newNode.prev=tail;
            newNode.next=head;
            head.prev=newNode;
            tail=newNode; 
        }
    }
    public void displayForward(){
        if(head==null){
            System.out.println("list is empty");
        } else{
            Node current=head;
            do { 
                System.out.print(current.data + " ");
                current=current.next;
            } while (current!=head);
        }
        System.out.println();
    }
    public void displayBackward(){
        if(head==null){
            System.out.println("list is empty");
        } else{
            Node current=head.prev;
            do { 
                System.out.print(current.data + " ");
                current=current.prev;
            } while (current!=head.prev);
        }
    }
    public static void main(String[] args) {
        DoublyCircularLL list=new DoublyCircularLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.displayForward();
        list.displayBackward();
    }
}
