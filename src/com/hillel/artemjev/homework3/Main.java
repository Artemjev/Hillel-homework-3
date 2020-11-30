package com.hillel.artemjev.homework3;

public class Main {

    public static void main(String[] args) {
        PointList pointList = new PointList();

//        System.out.println("1 - "+ pointList.newCapacity(1));
//        System.out.println("2 - "+pointList.newCapacity(2));
//        System.out.println("3 - "+pointList.newCapacity(3));
//        System.out.println("4 - "+pointList.newCapacity(4));
//        System.out.println("5 - "+pointList.newCapacity(5));
//        System.out.println("6 - "+pointList.newCapacity(6));
//        System.out.println("7 - "+pointList.newCapacity(7));
//        System.out.println("8 - "+pointList.newCapacity(8));
//        System.out.println("9 - "+pointList.newCapacity(9));
//        System.out.println("10 - "+pointList.newCapacity(10));
//        System.out.println("11 - "+pointList.newCapacity(11));

        System.out.println(pointList + "\n");
        pointList.add(new Point(0, 0));
        pointList.add(new Point(1, 1));
        pointList.add(new Point(2, 2));
        pointList.add(new Point(3, 3));
        pointList.add(new Point(4, 4));
        pointList.add(new Point(5, 5));
        pointList.add(new Point(6, 6));
        pointList.add(new Point(7, 7));
        pointList.add(new Point(8, 8));
        pointList.add(new Point(9, 9));
        pointList.add(new Point(10, 10));
        System.out.println(pointList + "\n");

        System.out.println("add to the end");
        pointList.add(new Point(11, 11));
        System.out.println(pointList + "\n");


        System.out.println("add to the beginning");
        pointList.add(0, new Point(-1, -1));
        System.out.println(pointList + "\n");

        System.out.println("add to 3th");
        pointList.add(3, new Point(777, 777));
        System.out.println(pointList + "\n");

        System.out.println("add to last");
        pointList.add(pointList.size() - 1, new Point(1000, 1000));
        System.out.println(pointList + "\n");

        System.out.println("remove first");
        pointList.remove(0);
        System.out.println(pointList + "\n");

        System.out.println("remove last");
        pointList.remove(pointList.size() - 1);
        System.out.println(pointList + "\n");

        System.out.println("remove 3th");
        pointList.remove(3);
        System.out.println(pointList + "\n");

//        когда у нас будут юнит тесты?

//        pointList.add(pointList.size(), new Point(1000, 1000));
//        pointList.add(-1, new Point(1000, 1000));
    }
}
