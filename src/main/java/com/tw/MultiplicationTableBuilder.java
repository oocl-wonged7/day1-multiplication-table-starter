package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int startNumber = 2;
        int endNumber = 4;
        System.out.println("isStartNumberNotBiggerThanEndNumber: " + isStartNumberNotBiggerThanEndNumber(startNumber, endNumber));

//        System.out.println(multiplicationTable);
    }

//    public String build(int start, int end) {
//        return "";
//    }

    private static boolean isStartNumberNotBiggerThanEndNumber(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }
}
