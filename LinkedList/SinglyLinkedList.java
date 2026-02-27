


class SinglyLinkedList{
    // Node class for data and address
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node heaNode;
    public SinglyLinkedList(){
        this.heaNode=null;
    }

public void add(int  data){
    Node newNode=new Node(data);
    if(heaNode==null){
        heaNode=newNode;
    } else{
        Node currNode=heaNode;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }   
}

public void display(){
    Node currNode=heaNode;
    while(currNode!=null){
        System.out.print(currNode.data+" ");
        currNode=currNode.next;
    }
}

    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);      
        list.add(5);
        list.add(6);

        list.display();
    }
}