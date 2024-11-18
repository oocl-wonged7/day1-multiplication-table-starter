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
        String multiplicationLine = java.util.stream.IntStream.rangeClosed(startNumber, endNumber)
                .mapToObj(i -> getMultiplicationResult(i, endNumber))
                .collect(java.util.stream.Collectors.joining(" "));
        return multiplicationLine;
    }

    private static String generateMultiplicationTable(int startNumber, int endNumber) {
        String multiplicationTable = java.util.stream.IntStream.rangeClosed(startNumber, endNumber)
                .mapToObj(i -> getMultiplicationLine(startNumber, i))
                .collect(java.util.stream.Collectors.joining("\n"));
        return multiplicationTable;
    }
}
