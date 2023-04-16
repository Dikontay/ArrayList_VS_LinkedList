import javax.management.ObjectName;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Object> list=new MyLinkedList<>();
        list.add(4);
        list.add(9);
        list.add(94);
        list.add(92);

       list.clear();

      for(int i =0; i<list.size(); i++){
          System.out.println(list.get(i));
      }


    }
}