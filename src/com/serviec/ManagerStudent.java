package com.serviec;

import com.model.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class ManagerStudent implements Manager<Student> {
    private ArrayList<Student> listStudent = new ArrayList<>();
    private int count = 0;
    private double avgScore = 0;
    private double max = 0;

    public ManagerStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ManagerStudent() {
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Student student) {
        student.setId(count);
        count++;
        listStudent.add(student);
    }

    @Override
    public void update(Student student, int id) {
        int index = findIndexById(id);
        listStudent.set(index, student);
    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        listStudent.remove(index);
    }

    @Override
    public void print() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    @Override
    public void sortAvgScore() {
        listStudent.sort(Comparator.comparingDouble(Student::getAvgScore));
    }

    @Override
    public double findScoreMax() {
        max = listStudent.get(0).getAvgScore();
        for (Student student : listStudent) {
            if (max < student.getAvgScore()) {
                max = student.getAvgScore();
            }
        }
        return max;
    }

    @Override
    public void findStudentByMax(double max) {
        for (Student student : listStudent) {
            if (student.getAvgScore() == max) {
                System.out.println(student);
            }

        }
    }

    @Override
    public Student getNameStudent(int id) {
        for (Student student : listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
