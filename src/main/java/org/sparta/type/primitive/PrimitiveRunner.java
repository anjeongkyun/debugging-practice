package org.sparta.type.primitive;

public class PrimitiveRunner {
    public static void main(String[] args) {
        int originalValue = 10;
        modifyPrimitiveValue(originalValue);
        System.out.println("After modifyPrimitiveValue: " + originalValue);  // 출력: ?
    }

    public static void modifyPrimitiveValue(int copiedValue) {
        copiedValue = 20;
    }
}
