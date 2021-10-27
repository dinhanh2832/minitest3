package com.serviec;

public interface Manager<T> {
    int findIndexById(int id);

    void add(T t);

    void update(T t, int id);

    void deleteById(int id);

    void print();

    void sortAvgScore();

    double findScoreMax();

    void findStudentByMax(double max);
    T getNameStudent(int id);
}
