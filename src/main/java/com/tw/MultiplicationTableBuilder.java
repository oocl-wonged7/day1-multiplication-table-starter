package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int startNumber = 2;
        int endNumber = 4;
        System.out.println("isStartNumberNotBiggerThanEndNumber: " + builder.isStartNumberNotBiggerThanEndNumber(startNumber, endNumber));
        System.out.println("isNumbersInRange2To1000: " + builder.isNumbersInRange2To1000(startNumber, endNumber));
        System.out.println("getMultiplicationResult: " + builder.getMultiplicationResult(2, 3));
        System.out.println("getMultiplicationLine: " + builder.getMultiplicationLine(2, 4));
//        System.out.println("getMultiplicationTable:\n" + builder.generateMultiplicationTable(2, 4));
//        System.out.println(multiplicationTable);
        builder.printMultiplicationTable(startNumber, endNumber);
    }

    public String printMultiplicationTable(int startNumber, int endNumber) {
        if (!isStartNumberNotBiggerThanEndNumber(startNumber, endNumber) || !isNumbersInRange2To1000(startNumber, endNumber)) {
            return null;
        }
        System.out.println(generateMultiplicationTable(startNumber, endNumber));
        return generateMultiplicationTable(startNumber, endNumber);
    }

    private static boolean isStartNumberNotBiggerThanEndNumber(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

    private static boolean isNumbersInRange2To1000(int start, int end) {
        return (start > 1 && start <= 1000) && (end > 1 && end <= 1000);
    }

    private static String getMultiplicationResult(int inputNumber1, int inputNumber2) {
        return inputNumber1 + "*" + inputNumber2 + "=" + inputNumber1 * inputNumber2;
    }

    private static String getMultiplicationLine(int startNumber, int endNumber) {
        int multiplier = endNumber;
        String multiplicationLine = "";
        for (int i = startNumber; i <= endNumber; i++) {
            multiplicationLine += getMultiplicationResult(i, multiplier);
            if (i != endNumber) {
                multiplicationLine += " ";
            }
        }
        return multiplicationLine.toString();
    }

    private static String generateMultiplicationTable(int startNumber, int endNumber) {
        String multiplicationTable = "";
        for (int i = startNumber; i <= endNumber; i++) {
            multiplicationTable += getMultiplicationLine(startNumber, i);
            multiplicationTable += "\n";
        }
        return multiplicationTable.toString();
    }
}
