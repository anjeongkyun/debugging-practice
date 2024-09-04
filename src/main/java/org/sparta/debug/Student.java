package org.sparta.debug;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;

    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if(grade < 0) {
            grade = 0;
        }
        grades.add(grade);
    }

    public double calculateAverage() {
        if(grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / (grades.size());
    }

    public double calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public double calculateSumWithStreams() {
        return grades.stream().mapToInt(Integer::intValue).sum();
    }

    public double calculateAverageWithStreams() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public String getName() {
        return name;
    }
}
