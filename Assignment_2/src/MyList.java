public interface MyList <E> {
    void add(E data);



    E get(int index);

    Object remove(int index);

    int size();
    boolean contains(Object o);
    void add (E item, int index);
    void clear();
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();


}
