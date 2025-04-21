package Prime;



public class Queue {
    private  Node head,tail;
    private  int length;

    public  Queue( ){
        this.head=this.tail=null;
        this.length=0;
    }
    public  void enqueue( int value){
        Node newNode= new Node(value);

        if(tail==null){
            tail=head=newNode;
        }else{
            //assign the current tail vlaue next to new value
            tail.next=newNode;
            //point tail to newvalue
            tail= newNode;
        }
        length++;
    }

    public  int  dequeue(){
        if(isEmpty()){
            System.out.println("cant remove from empty queue");
            return -1;
        }
        int value = head.data;
        head= head.next;
        if(isEmpty()){
            //that mean that was the last elment so both shoud point on them tha't why
            tail=null;
        }
        length--;
        return  value;
    }

    public int  peak(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return  -1;
        }
        return head.data;
    }
    public boolean isEmpty() {
        return head == null;
    }
}
