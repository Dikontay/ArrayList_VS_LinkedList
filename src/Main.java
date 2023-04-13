import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       MyArrayList <Object> arr = new MyArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
       arr.add(2);
       arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(4);
        arr.add(6);
        arr.add(6);
      // System.out.println(arr.size());
arr.remove(3);

        for(int i = 0; arr.get(i)!=null ; i++){
            System.out.println(arr.get(i)+" ");
        }
        //System.out.println(arr.size());
    }
}