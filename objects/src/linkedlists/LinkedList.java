package linkedlists;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class LinkedList {
    Item head;
    Item last;
    private int size;

    public int size() {
        return size;
    }

    public void add(Book addKey, int addValue) {
        Item item = new Item(addKey, addValue);
        if (head == null) {
            head = item;
            last = item;
        } else {
            last.next = item;
            last = item;
        }
        size++;
    }

    public void setValue(Book key, int setValue) {
        if (head != null) {
            Item item = head;

            boolean isSet = false;
            while (item != null) {
                if (key.equals(item.key)) {
                    item.value = setValue;
                    isSet = true;
                }
                item = item.next;
            }
            if (!isSet) {
                System.out.println("Key doesn't exist");
            }
        } else {
            System.out.println("key doesn't exist");
        }
    }

    public int get(Book key) {
        if (head != null) {
//            int i = 0;
            Item item = head;

            while (item != null) {
                if (key.equals(item.key)) {
                    return item.value;
                }
                item = item.next;
//                i++;
            }
//            throw new IndexOutOfBoundsException(index + " from " + (i - 1));
            return -1;
        } else {
//            throw new IndexOutOfBoundsException(index + " from 0");
            return -1;
        }
    }

    public void remove(int index) {
        if (head != null) {
            if (index == 0) {
                head = head.next;
                size--;
                return;
            }
            int i = 0;
            Item item = head;
            Item prev = head;
            while (item != null) {
                if (i == index) {
                    prev.next = item.next;
                    size--;
                    return;
                }
                prev = item;
                item = item.next;
                i++;
            }
            throw new IndexOutOfBoundsException(index + " from " + (i - 1));
        } else {
            throw new IndexOutOfBoundsException(index + " from 0");
        }
    }
}
