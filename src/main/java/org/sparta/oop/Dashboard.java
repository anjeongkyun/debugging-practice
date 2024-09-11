package org.sparta.oop;

public class Dashboard {
    private int speed; //속도
    private int fuelLevel; //연료

    public Dashboard() {
        this.speed = 0;  // 초기 속도는 0
        this.fuelLevel = 100;  // 초기 연료는 100
    }

    // 속도를 설정하는 메서드
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    // 연료량을 설정하는 메서드
    public void consumeFuel(int amount) {
        if (this.fuelLevel - amount >= 0) {
            this.fuelLevel -= amount;
        } else {
            this.fuelLevel = 0;
        }
    }

    // 계기판 정보를 출력하는 메서드
    public void displayDashboard() {
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Fuel Level: " + this.fuelLevel + " %");
    }
}
