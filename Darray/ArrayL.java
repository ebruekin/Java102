package Darray;



public class ArrayL<T> {
   
    private T[] arr;  // arr is the array which stores my ArrayL elements
    private int capacity; // capacity is the total storage
    private int current; // current is the number of elements

    @SuppressWarnings("unchecked")
    //constructor
    public ArrayL(){
        arr = (T[]) new Object[10];
        capacity = 10;
        current = 0;
    }

    //constructor
    @SuppressWarnings("unchecked")
    public ArrayL(int capacity){
        this.capacity = capacity;
        arr = (T[]) new Object[this.capacity];
        current = 0;
    }

    @SuppressWarnings("unchecked")
    public void push(T data){
        if(current == capacity){
            T[] temp = (T[]) new Object[this.capacity*2];
            for(int i=0; i< capacity;i++){
                temp[i] = arr[i];
            }
            capacity = capacity*2;
            arr = temp;
        }
        // insert data
        arr[current] =  data;
        current++;
    }

    public void push(T data,int index){
        if(index == capacity)
            push(data);  
        else
            arr[index] = data; 
    }

    public int getcapacity(){
        return this.capacity;
    }

    public int size(){
        return this.current;
    }

    public T get(int index){
        if(index < current){
            return arr[index];
        }else
            return null;
    }



    public void print(){
        for (int i = 0; i < current; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




}
