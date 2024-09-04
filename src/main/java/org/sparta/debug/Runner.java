package org.sparta.debug;

public class Runner {
    public static void main(String[] args) {
        Student eddy = new Student("Eddy");
        System.out.println(eddy);

        eddy.addGrade(50);
        eddy.addGrade(45);
        eddy.addGrade(35);
        eddy.addGrade(60);

        System.out.println("=====================");
        System.out.println(eddy.getName() + " average: " + eddy.calculateAverage());
        System.out.println(eddy.getName() + " sum: " + eddy.calculateSum());

        System.out.println("\n=====================\n");

        Student brown = new Student("Brown");
        brown.addGrade(80);
        brown.addGrade(85);
        brown.addGrade(85);
        brown.addGrade(90);

        System.out.println(brown.getName() + " average: " + brown.calculateAverage());
        System.out.println(brown.getName() + " sum: " + brown.calculateSum());
        System.out.println("=====================");
    }
}
