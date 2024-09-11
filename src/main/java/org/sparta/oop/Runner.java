package org.sparta.oop;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Red");
        Car car2 = new Car("BMW", "Blue");

        // Tesla 가속
        car1.accelerate(60);
        car1.displayStatus();  // Tesla의 상태 출력

        // BMW 가속
        car2.accelerate(30);
        car2.displayStatus();  // BMW의 상태 출력
    }
}
