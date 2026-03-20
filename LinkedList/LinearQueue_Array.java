public class LinearQueue_Array {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;

    public LinearQueue_Array(int size){
        this.capacity=size;
        this.array=new int[size];
        front=0;
        rear=-1;
    }
    public void enqueue(int data){
        if(rear==capacity-1){
            System.out.println("Overflow!cannot enqueue"+data);
            return;
        }
       array[++rear]=data; 
    }
    public boolean isEmpty(){
        return front > rear;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;   
        } else{
            for(int i=front; i<=rear; i++){
                System.out.print(array[i]+"->");
            }
        }
    }
    
    public void dequeue(int data){
        System.out.println();
        if(isEmpty()){
            System.out.println("Underflow!cannot dequeue"+data);
            return;
        }
        int removedElement=array[front++];
        System.out.println("Dequeued element: "+removedElement);
    }

    public static void main(String[] args) {
     LinearQueue_Array queue_Array=new LinearQueue_Array(5);   
        queue_Array.enqueue(10);
        queue_Array.enqueue(20);
        queue_Array.enqueue(30);

        queue_Array.display();
        queue_Array.dequeue(10);
        queue_Array.display();
    }
}
