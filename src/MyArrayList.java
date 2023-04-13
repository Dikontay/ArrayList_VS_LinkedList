import java.util.Arrays;

public class MyArrayList <E> implements MyList{
   private int size = 5;
   private int index ;

   private Object [] arrayList;
   public MyArrayList(){
         arrayList = new Object[size];
   }


    @Override
    public void add(Object data) {
       if(index == size){
           increaseSize();

       }
        arrayList[index++]= data;

    }

    @Override
    public Object get(int index) {
        return arrayList[index];
    }

    @Override
    public void remove() {

    }

    @Override
    public int size() {
        return this.size;
    }
    private void increaseSize(){
      size = (int) (size *1.5);
        Object [] temp = new Object[size];
        System.arraycopy(arrayList, 0, temp, 0, size);
        arrayList = temp;

    }

}
