package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int startNumber = 2;
        int endNumber = 4;
        System.out.println("isStartNumberNotBiggerThanEndNumber: " + builder.isStartNumberNotBiggerThanEndNumber(startNumber, endNumber));
        System.out.println("isNumbersInRange2To1000: " + builder.isNumbersInRange2To1000(startNumber, endNumber));
//        System.out.println(multiplicationTable);
    }

//    public String build(int start, int end) {
//        return "";
//    }

    private static boolean isStartNumberNotBiggerThanEndNumber(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

    private static boolean isNumbersInRange2To1000(int start, int end) {
        return (start > 1 && start <= 1000) && (end > 1 && end <= 1000);
    }

}
