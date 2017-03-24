package linkedlists;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Item {
    Book key;
    int value;
    Item next; //ссылка на следующий элемент списка

    public Item(Book key, int value) {
        this.key = key;
        this.value = value;
    }
}