package linkedlists;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Library {
    private int qtyAllBooks;
    LinkedList[] bookLinkedList;

    public Library(int qtyAllBooks) {
        this.qtyAllBooks = qtyAllBooks;
        bookLinkedList = new LinkedList[qtyAllBooks];
    }

    //вернуть в библиотеку
    public void returnBook(Book book, int qty) {
        if (book != null) {
            int availableQty = this.get(book);
            put(book, availableQty + qty);
            System.out.println("Принятых книг: " + qty);
        }
    }

    //    устанавливает новое значение qty у соотв книги в библиотеке
    public void put(Book book, int qty) {
        if (book != null) {
            int hc = Math.abs(book.hashCode()) % bookLinkedList.length;
            bookLinkedList[hc].setValue(book, qty);
        }
    }

    public int get(Book book) {
        int hc = Math.abs(book.hashCode()) % bookLinkedList.length;
        return bookLinkedList[hc].get(book);
    }

    //взять из библиотеки
    public int giveBook(Book book, int qty) {
        if (book != null) {
            int availableQty = this.get(book);
            if (availableQty >= qty) {
                this.put(book, availableQty - qty);
                return qty;
            } else {
                this.put(book, 0);
                return availableQty;
            }
        } else {
            return -1;
        }
    }
}
