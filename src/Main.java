import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       MyLinkedList <Object> arr = new MyLinkedList<>();

       arr.add(2);
       arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(4);
        arr.add(6);
        arr.add(6);
      // System.out.println(arr.size());

        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i)+" ");
        }
        //System.out.println(arr.size());
    }
}