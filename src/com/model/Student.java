package com.model;

public class Student extends People {
    private double mathScore;
    private double chemistryScore;
    private double physicScore;
    private double avgScore;
    private int id;

    public Student(String name, int age, double mathScore, double chemistryScore, double physicScore) {
        super(name, age);
        this.mathScore = mathScore;
        this.chemistryScore = chemistryScore;
        this.physicScore = physicScore;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getPhysicScore() {
        return physicScore;
    }

    public void setPhysicScore(double physicScore) {
        this.physicScore = physicScore;
    }

    public double getAvgScore() {
        return avgScore = (getChemistryScore() + getMathScore() + getPhysicScore()) / 3;
    }

    @Override
    public String toString() {
        return String.format("|%-8s|%-10d|%-7d|%-13f|%-13f|%-13f|%-13f|",
                getName(), getId(), getAge(), mathScore, chemistryScore, physicScore,getAvgScore());
    }
    public static void printLine(int space) {
        for (int i = 0; i <= space; i++) {
            if (i == space) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }
    public static void printFullLine() {
        System.out.print("+");
        printLine(8);
        printLine(10);
        printLine(7);
        printLine(13);
        printLine(13);
        printLine(13);
        printLine(13);
        System.out.println();
    }
}
