package Prime;

public class ArrayList<T> {
    private int capacity;
    private T[] data;
    private  int size;

    public  ArrayList(int intcapctiy){
        this.capacity=intcapctiy;
        this.size=0;
        this.data= (T[])new Object[capacity];

    }

    public void  canResize(){
        if(this.size==this.capacity){
            int newCapacity = this.capacity == 0 ? 1 : this.capacity * 2;
            T[] newArray = (T[])new Object[newCapacity];
            this.capacity=newCapacity;
            System.arraycopy(this.data, 0, newArray, 0, size);
            this.data=newArray;
        }
    }

    //o(1)
    public  void  add(T value){
        canResize();
        this.data[size]=value;
        size++;
    }

    //o(1)
    public  T get(int index){
        indexvalidatin(index);
        return  this.data[index];

    }
    //0(1)
    public  void set(int index,T value){
        indexvalidatin(index);
        this.data[index]=value;
    }

    public T removeAt(int index){
        indexvalidatin(index);
        T removedValue=this.data[index];
        //shift
        for (int i = index; i <size-1 ; i++) {
            this.data[i]=this.data[i+1];

        }
        this.size--;
        return  removedValue;
    }

    public T remove() {
        if (this.size == 0) throw new IllegalStateException("Cannot remove from empty list.");
        T removedValue = this.data[size - 1];
        this.size--;
        return removedValue;
    }

    public int sizeOfArrlylist(){
        return  this.size;
    }
    public  boolean isEmpty(){
        return this.size==0;
    }

    public  void indexvalidatin(int index){
        if(!(index>=0 && index<size)) throw new IndexOutOfBoundsException("he");

    }


}
