package PracticalPart.SecondTask;

public class List <T> {
    private Elem<T> head;
    private Elem<T> tail;
    private int count;

    public List() {
        head = null;
        tail = null;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public Elem<T> getElem(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        Elem<T> temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void delAll() {
        head = null;
        tail = null;
        count = 0;
    }

    public void del(int index) {
        Elem<T> del = getElem(index);
        Elem<T> prevDel = del.prev;
        Elem<T> afterDel = del.next;

        if(prevDel != null && count != 1) {
            prevDel.next = afterDel;
        }
        if (afterDel != null && count != 1) {
            afterDel.prev = prevDel;
        }

        if (index == 0) {
            head = afterDel;
        }
        if (index == count-1) {
            tail = prevDel;
        }
        count--;
    }

    public void insert(int index, T value) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        if (index == count) {
            pushBack(value);
        } else if (index == 0) {
            pushFront(value);
        } else {
            Elem<T> ins = head;
            for (int i = 0; i < index; i++){
                ins = ins.next;
            }

            Elem<T> prevIns = ins.prev;
            Elem<T> temp = new Elem<>(value);

            if (prevIns != null && count != 0) {
                prevIns.next = temp;
            }
            temp.next = ins;
            temp.prev = prevIns;
            ins.prev = temp;

            count++;
        }
    }

    public void pushBack(T value) {
        Elem<T> temp = new Elem<>(value);
        temp.prev = tail;
        if (tail != null) {
            tail.next = temp;
        }
        if (count == 0) {
            head = tail = temp;
        } else {
            tail = temp;
        }
        count++;
    }

    public void pushFront(T value) {
        Elem<T> temp = new Elem<>(value);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        if (count == 0) {
            head = tail = temp;
        } else {
            head = temp;
        }
        count++;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[");
        Elem<T> temp = head;
        while (temp != null) {
            out.append(temp.value).append(", ");
            temp = temp.next;
        }
        if (out.length() != 1) {
            out = new StringBuilder(out.subSequence(0, out.length()-2));
        }
        out.append("]");
        return out.toString();
    }
}
