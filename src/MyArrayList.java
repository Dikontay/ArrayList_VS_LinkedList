public class MyArrayList <E> implements MyList{
   private int size = 1;
   private int index ;

   private Object [] arrayList;
   public MyArrayList(){
         arrayList = new Object[size];
   }


    @Override
    public void add(Object data) {
        arrayList[index]= data;
        index++;
    }

    @Override
    public int get() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public int size() {
        return 0;
    }
    private void increaseSize(){
      size = (int) (size *1.5);
    }
}
