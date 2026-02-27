

public class ReverseLL {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head,tail;
    public void  ReverseLL(){
        head=tail=null;
    }
    public void add (int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        } else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + "-> ");
           
            current=current.next;
        }
        System.out.println();
    }

    void displayReverse(){
        Node current=head;
        Node prev=null,next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            System.out.print(prev.data +"<-");
        }
    }
    public static void main(String[] args) {
        ReverseLL list=new ReverseLL();
 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display();
        list.displayReverse();
    }
}
