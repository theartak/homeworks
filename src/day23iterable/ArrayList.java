package day23iterable;

import java.util.Iterator;

public class ArrayList implements List {

    private int defaultSize = 10;
    private int[] arrayList = new int[defaultSize];
    private int count;

    private void defaultSizeEnlarger() {
        defaultSize += (defaultSize * 0.5);
        int[] constant = arrayList;
        arrayList = new int[defaultSize];
        for (int i = 0; i < count; i++) {
            arrayList[i] = constant[i];
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return arrayList == null;
    }

    @Override
    public int get(int index) {
        if (index > count) {
            throw new IndexOutOfBoundsException();
        }
        return arrayList[index];
    }

    @Override
    public void add(int val) {
        arrayList[count] = val;
        count++;

        if (count == defaultSize) {
            defaultSizeEnlarger();
        }
    }

    @Override
    public void add(int index, int val) {
        if (index > count) {
            throw new IndexOutOfBoundsException();
        }

        int element = arrayList[index];
        arrayList[index] = val;
        count++;

        if (count == defaultSize) {
            defaultSizeEnlarger();
        }

        for (int i = index + 1; i < count; i++) {
            int con = arrayList[i];
            arrayList[i] = element;
            element = con;
        }


    }

    @Override
    public void delete(int index) {
        if (index > count) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < count; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        count--;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Integer> {

        private int size;

        @Override
        public boolean hasNext() {
            return size < count;
        }

        @Override
        public Integer next() {
            Integer value = arrayList[size];
            size++;
            return value;
        }
    }
}