package com.hillel.artemjev.homework3;

import java.util.Arrays;

public class PointList {
    private static final int DEFAULT_CAPACITY = 4;
    private Point[] points = new Point[DEFAULT_CAPACITY];
    private int size;

    public void add(Point p) {
        ensureCapacity();
        points[size++] = p;
    }

    public void add(int index, Point p) {
        checkExistsIndex(index);
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            points[i + 1] = points[i];
        }
        points[index] = p;
        size++;
    }

    public void remove(int index) {
        checkExistsIndex(index);
        for (int i = index; i < size - 1; i++) {
            points[i] = points[i + 1];
        }
        points[--size] = null;
    }

    public Point get(int index) {
        checkExistsIndex(index);
        return points[index];
    }

    public void set(int index, Point p) {
        checkExistsIndex(index);
        points[index] = p;
    }

    public int size() {
        return size;
    }

    private void checkExistsIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "PointList{" +
                "points=" + Arrays.toString(points) +
                ", size=" + size +
                '}';
    }

    //--------------------------------------------------------------------
    // https://prnt.sc/vsit9b
    //--------------------------------------------------------------------
    private void ensureCapacity() {
        if (size == points.length) {
            points = Arrays.copyOf(points, newCapacity(points.length));
        }
    }

    private int newCapacity(int oldCapacity) {
        return oldCapacity + oldCapacity / 2 + oldCapacity % 2;
    }
}
