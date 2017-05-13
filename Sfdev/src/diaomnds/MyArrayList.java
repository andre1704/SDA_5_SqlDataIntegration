package diaomnds;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-18.
 */
public class MyArrayList<T> {
    private int current = 0;
    private Object[] tab;

    MyArrayList() {
        tab = new Object[10];
    }

    public void add(T t) {
        if (tab.length == current + 1)
            tab = Arrays.copyOf(tab, tab.length + 10);
        tab[current] = t;
        current++;

    }

    public int size() {
        int size = 0;
        for (int i = 0; i < tab.length; i++) {

            if (tab[i] != null)
                size++;
            else break;
        }
        return size;
    }

    public boolean isEmpty() {
        return current == 0;
    }

    public boolean contains(T t) {
        boolean pom = false;
        for (int i = 0; i < size(); i++) {
            pom = tab[i] == t;
        }
        return pom;
    }

    public int lastInxedOf(T t) {
        int last = 0;
        for (int i = 0; i < size(); i++) {
            if (tab[i] == t)
                last = i;
        }
        return last;
    }

    public T get(int i) {
        if (i < tab.length)
            return (T) tab[i];
        else {
             throw new ExceptionOutOfRange(size(),i);
        }
    }
}
