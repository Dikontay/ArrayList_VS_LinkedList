import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       MyArrayList <Object> arr = new MyArrayList<>();

       arr.add(2);
       arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(1);
        arr.add(9);
        arr.add(123, 0);
       // System.out.println(arr.size());

       //System.out.println(arr.size());

        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i)+" ");
        }
        //System.out.println(arr.size());
    }
}