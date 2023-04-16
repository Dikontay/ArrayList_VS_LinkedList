public class MyLinkedList <E> implements MyList{
    private MyNode head;
    private MyNode tail;
    private int size;
    private class MyNode {
        E data;
        MyNode next;
        MyNode prev;
        public MyNode( E data){

            this.data = data;
        }
        public MyNode(){

        }
    }

    @Override
    public void add(Object data) {
        MyNode newNode = new MyNode((E)data);
       if(head == null){
           head= newNode;
           tail = newNode;
       } else  {tail.next = newNode;
        newNode.prev = tail;
        tail= newNode;}
       size++;

    }

    @Override
    public Object get(int index) {
        MyNode  temp;
        if(index > size/2){
            temp = tail;
           for(int i = size-1; i>index; i--){
               temp = temp.prev;
           }
            return temp.data;
        }else{
             temp = head;
            for(int i =0; i<index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }



    @Override
    public E remove(int index) {
      
    }

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        MyNode temp = head;
        for(int i = 0; i<size; i++){

            if(temp.data == o){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        MyNode temp = tail;
        int i = size-1;
        while(temp.data!=o){
            i--;
            temp=temp.prev;
        }
        return i;
    }

    @Override
    public void sort() {

    }
}
