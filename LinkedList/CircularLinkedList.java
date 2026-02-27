class  CircularLinkedList{

    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    private Node headNode,tailNode;
    public CircularLinkedList(){
        headNode=tailNode=null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(headNode==null){
            headNode=tailNode=newNode;
            newNode.next=headNode;
        } else{
            tailNode.next=newNode;
            tailNode=newNode;
            tailNode.next=headNode;
            
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }
}