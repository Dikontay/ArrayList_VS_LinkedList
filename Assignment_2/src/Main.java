import javax.management.ObjectName;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Object> list=new MyLinkedList<>();
        list.add(4);
        list.add(9);
        list.add(94);
        list.add(92);
        list.add(96);
        list.add(92);

        System.out.println(list.lastIndexOf(92));


    }
}