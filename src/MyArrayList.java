public class MyArrayList <E> implements MyList{

   private int length ;
private static final int size = 5;
   private Object [] arrayList;

   public MyArrayList(){
       arrayList = new Object[size];
   }


    @Override
    public void add(Object data) {
       if(length == size()){
           increaseSize();

       }
        arrayList[length++]= data;


    }

    @Override
    public Object get(int index) {
       if(index>=length){
           throw new IndexOutOfBoundsException();
       }
        return arrayList[index];

    }

    @Override
    public void remove(int index) {
        arrayList[index] = null;
        for (int i = index; i < arrayList.length - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        length--;


    }

    @Override
    public int size() {
        return length;
    }
    private void increaseSize(){
      int biggerSize = (int) (arrayList.length *3);
        Object [] temp = new Object[biggerSize];
        System.arraycopy(arrayList, 0, temp, 0, arrayList.length);
        arrayList = temp;

    }

}
