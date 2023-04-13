public class MyLinkedList <E> implements MyList{
   private MyNode head;
   private MyNode tail;
private int size;
    public class MyNode <E>{
        E data;
        MyNode next;
        MyNode prev;
        public MyNode(E data){
            this.data = data;
        }
    }

    @Override
    public void add(Object data) {
          MyNode newNode= new MyNode((E) data);
          if(head == null){
              head=tail=newNode;
          }else{
              tail.next=newNode;
              tail=newNode;
              tail.prev= newNode;
          }
          size++;

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return size;
    }
}
