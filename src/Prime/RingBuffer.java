package Prime;

import java.util.EmptyStackException;

public class RingBuffer<T>{
    private  int capacity;
    private  int size;
    private  T[] buffer;
    private  int ReadIndex;
    private  int WriteIndex;

    public  RingBuffer(int initCapacity){
        this.ReadIndex=this.WriteIndex=this.size=0;
        this.buffer=(T[]) new Object[initCapacity];



    }

    //write at read index
    public  void enqueue(T value){

        this.buffer[this.WriteIndex]=value;

        if(this.size!=0 && this.WriteIndex==this.ReadIndex){

            this.ReadIndex= newIndex(this.ReadIndex);
        }
        this.WriteIndex= newIndex(this.WriteIndex);
        this.size++;
    }

    //make sure alwyn in capacity
    public int  newIndex(int prevIndex){
        return (prevIndex+1)%this.capacity;
    }
    //pop from readindex
    public  T dequeue(){
            if(this.size==0) throw new EmptyStackException();
            T value = this.buffer[this.ReadIndex];
            this.ReadIndex=newIndex(this.ReadIndex);
            this.size--;
            return  value;

    }
    public  T peek(){
        if(this.size==0) throw new EmptyStackException();
        return this.buffer[this.ReadIndex];
    }
    public  T peekBack(){
        if(this.size==0) throw new EmptyStackException();
        int i = this.WriteIndex-1;
            if(i<0){
                i=this.capacity-1;
            }

            return  this.buffer[i];
    }
}
