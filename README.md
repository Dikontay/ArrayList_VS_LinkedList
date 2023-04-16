MyArrayList and MyLinkedList
This project implements the MyList interface and provides two implementations of it, MyArrayList and MyLinkedList. Both classes provide a way to store and manipulate a list of elements. The MyList interface defines the following methods:

void add(E data)
E get(int index)
Object remove(int index)
int size()
boolean contains(Object o)
void add(E item, int index)
void clear()
int indexOf(Object o)
int lastIndexOf(Object o)
void sort()

MyArrayList
MyArrayList is a class that implements the MyList interface using an array to store its elements. It has the following characteristics:

The initial capacity of the internal array is 5.
When the array is full, its size is increased by 1.5.
Adding or removing an element in the middle of the list requires shifting all the elements after that index.
The sort method uses the Arrays.sort method to sort the elements.


MyLinkedList
MyLinkedList is a class that implements the MyList interface using a linked list to store its elements. It has the following characteristics:

It maintains a head and a tail reference to the first and last nodes in the list, respectively.
Each node in the list stores an element and references to its previous and next nodes.
Adding or removing an element in the middle of the list only requires updating the references of the affected nodes.
The sort method uses the bubble sort algorithm to sort the elements.

Usage
To use MyArrayList or MyLinkedList, you first need to create an instance of the class:


MyList<Integer> list = new MyArrayList<>();
or

MyList<Integer> list = new MyLinkedList<>();
Then you can use the methods defined in the MyList interface to add, get, remove, and manipulate elements in the list:
list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(1)); // Output: 20

list.remove(0);

System.out.println(list.size()); // Output: 2

System.out.println(list.contains(20)); // Output: true

list.add(15, 1);

System.out.println(list.get(1)); // Output: 15

list.clear();

System.out.println(list.size()); // Output: 0

Conclusion
MyArrayList and MyLinkedList are two different implementations of the MyList interface that provide different trade-offs in terms of performance and memory usage. By choosing the appropriate implementation for your needs, you can optimize the performance of your code.
