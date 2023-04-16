import javax.management.ObjectName;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList <Integer>list=new MyLinkedList<Integer>();
        list.add(4);
        list.add(9);
        list.add(94);
        list.add(92);
        list.add(93, 2);




      for(int i =0; i<list.size(); i++){
          System.out.println(list.get(i));
      }
        list.sort();
        System.out.println("This is sorted: ");
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}