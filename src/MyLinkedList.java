import java.util.Comparator;

public class MyLinkedList <E extends  Comparable<E>>  implements MyList {
    private MyNode head;
    private MyNode tail;
    private int size;


    private class MyNode  {
        E data;
        MyNode next;
        MyNode prev;
        public MyNode(E data){

            this.data = data;
        }
        public MyNode(){

        }
        public E getData(){
            return this.data;
        }




    }




    @Override
    public void add(Object data) {
        MyNode newNode = new MyNode((E) data);
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

        if(index==0){
            MyNode current=head;
            current.next=head.next;
            head = head.next;
            size--;
            return current.data;
        }else if(index==size-1){
            MyNode  current = tail;
            tail = current.prev;
            size--;
            return current.data;
        }else {
            MyNode  temp;
            if(index > size/2){
                temp = tail;
                for(int i = size-1; i>index; i--){
                    temp = temp.prev;
                }
            }else{
                temp = head;
                for(int i =0; i<index; i++){
                    temp = temp.next;
                }
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            size--;
            return temp.data;

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
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        MyNode newNode = new MyNode((E) item);
        MyNode temp = head;
        if(index==0){
            head.prev=newNode;
            newNode.next=head;
            head = newNode;
            size++;
            return;
        }else if(index==size-1){
            add(item);
        }
        for(int i =0; i<index; i++){
            temp= temp.next;
        }
        temp.prev.next=newNode;
            temp.prev=newNode;
            newNode.next=temp;
            newNode.prev=temp.prev;


        size++;

    }




    @Override
    public void clear() {
        head = null;
        tail = null;
        size =0;
    }

    @Override
    public int indexOf(Object o) {
        MyNode temp = head;
        int i = size-1;
        while(temp.data!=o){
            i--;
            temp=temp.next;
        }
        return i;
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
      boolean isSwapped=true;
      while(isSwapped){
          isSwapped = false;
          MyNode temp = head;
          while(temp.next!=null){
            if(temp.data.compareTo(temp.next.data)>0){
                E t = temp.data;
                temp.data = temp.next.data;
                temp.next.data = t;
                isSwapped = true;
            }
              temp = temp.next;
          }

      }
    }

}
