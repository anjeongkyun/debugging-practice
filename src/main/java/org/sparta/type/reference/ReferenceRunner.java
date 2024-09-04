package org.sparta.type.reference;

class CustomObject {
    int value;

    CustomObject(int value) {
        this.value = value;
    }
}

public class ReferenceRunner {
    public static void main(String[] args) {
        CustomObject originalObject = new CustomObject(10);
        modifyObjectValue(originalObject);
        System.out.println("After modifyObjectValue: " + originalObject.value);  // 출력: ?

        reassignObjectReference(originalObject);
        System.out.println("After reassignObjectReference: " + originalObject.value);  // 출력: ?
    }

    public static void modifyObjectValue(CustomObject copiedObject) {
        copiedObject.value = 20;
        System.out.println(copiedObject);
    }

    public static void reassignObjectReference(CustomObject copiedObject) {
        copiedObject = new CustomObject(30);
        System.out.println(copiedObject);
    }
}
