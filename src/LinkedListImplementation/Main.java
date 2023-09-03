package LinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(2);
        list.insertFirst(9);
        list.insertFirst(1);
        list.insertLast(6);
        list.display();
        list.insert(12, 3);   // 0 1 2 3
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3)); // 0 1 2 3
        list.display();
        System.out.println(list.find(9));


    }
}
