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
        return "Student{" +
                " name: " + getName() +
                "mathScore=" + mathScore +
                ", chemistryScore=" + chemistryScore +
                ", physicScore=" + physicScore +
                ", avgScore=" + avgScore +
                ", id=" + id +
                '}';
    }
}
