package linkedlists;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class MainTestDrive {
    public static void main(String[] args) {
//       Adder
        System.out.println("Adder:");
        Adder adder = new Adder(10);
        adder.increment();
        System.out.println(adder.getValue());
        adder.add(10);
        System.out.println(adder.getValue());
        System.out.println();

//        LinkedList
        System.out.println("LinkedList:");
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(new Book(i + "", i + "", i), i);
        }
        System.out.println(list.get(new Book("0", "0", 0)));
        System.out.println(list.get(new Book("1", "1", 1)));
        System.out.println(list.get(new Book("2", "2", 2)));
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(new Book(i + "", i + "", i)));
        }
        System.out.println();

        list.remove(9);
        list.remove(5);
        list.remove(0);
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(new Book(i + "", i + "", i)));
        }
        System.out.println();


//            Библиотека
        System.out.println("Library:");
        int x = 15;
        Library library = new Library(x);
        //заполняем библиотеку книгами

        for (int i = 0; i < 15; i++) {
            Book book = new Book(i + "", i + "", i);
            int hc = Math.abs(book.hashCode()) % library.bookLinkedList.length;
            if (library.bookLinkedList[hc] == null) {
                library.bookLinkedList[hc] = new LinkedList();
                library.bookLinkedList[hc].add(book, i);
            } else {
                library.bookLinkedList[hc].add(book, i);
            }
        }

        for (int i = 0; i < 15; i++) {
            Book book = new Book(i + "", i + "", i);
            System.out.println(library.get(book));
        }
        System.out.println();

        library.returnBook(new Book("0", "0", 0), 2);
        library.returnBook(new Book("14", "14", 14), 14);

        for (int i = 0; i < 15; i++) {
            Book book = new Book(i + "", i + "", i);
            System.out.println(library.get(book));
        }
        System.out.println();

        System.out.println("Выдано книг : " + library.giveBook(new Book("0", "0", 0), 3));
        System.out.println("Выдано книг : " + library.giveBook(new Book("14", "14", 14), 3));
        System.out.println("Выдано книг : " + library.giveBook(new Book("15", "15", 15), 3));
        System.out.println();

        for (int i = 0; i < 15; i++) {
            Book book = new Book(i + "", i + "", i);
            System.out.println(library.get(book));
        }
    }

}
