package org.sparta.oop;

public class Car {
    private String model;
    private String color;
    private Dashboard dashboard;  // 계기판 객체 포함

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.dashboard = new Dashboard();  // 새로운 계기판 생성
    }

    // 속도를 올리는 메서드
    public void accelerate(int increment) {
        this.dashboard.setSpeed(this.dashboard.getSpeed() + increment);  // 속도 증가
        this.dashboard.consumeFuel(5);  // 가속할 때마다 연료 5% 소비
    }

    // 현재 자동차 상태를 계기판으로 출력하는 메서드
    public void displayStatus() {
        System.out.println("Model: " + this.model + ", Color: " + this.color);
        dashboard.displayDashboard();  // 계기판 정보 출력
    }
}
