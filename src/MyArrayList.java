public class MyArrayList <E> implements MyList{

   private int index ;
private int size = 5;
   private Object [] arrayList;

   public MyArrayList(){
       arrayList = new Object[size];
   }


    @Override
    public void add(Object data) {
       if(index == size()){
           increaseSize();

       }
        arrayList[index++]= data;


    }

    @Override
    public Object get(int index) {
        return arrayList[index];
    }

    @Override
    public void remove(int index) {
         arrayList[index]= null;
         
    }

    @Override
    public int size() {
        return index;
    }
    private void increaseSize(){
      int biggerSize = (int) (arrayList.length *3);
        Object [] temp = new Object[biggerSize];
        System.arraycopy(arrayList, 0, temp, 0, arrayList.length);
        arrayList = temp;

    }

}
