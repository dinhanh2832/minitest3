package com.company;

import com.model.Student;
import com.serviec.ManagerStudent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManagerStudent listStudent = new ManagerStudent();
        listStudent.add(new Student("ánh", 18, 9, 9, 9));
        listStudent.add(new Student("khánh", 18, 10, 10, 10));
        listStudent.add(new Student("hương", 18, 8, 8, 8));
        listStudent.print();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = -1;
            System.out.println("--------------------------");
            System.out.println("Menu");
            System.out.println("1. Tìm học sinh: ");
            System.out.println("2. Sửa học sinh: ");
            System.out.println("3. Xóa học sinh: ");
            System.out.println("4. Điểm trung bình cao nhất: ");
            System.out.println("5. Sắp xếp theo thứ tự điểm trung bình: ");
            System.out.println("6. Thêm học sinh: ");
            System.out.println("7. Tìm học sinh có điểm tb cao nhất: ");
            System.out.println("0. Exit");
            System.out.println("--------------------------");
            System.out.println("Enter your choice: ");
            while (choice == -1) {
                try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                    sc.nextLine();
                }
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Nhập id học sinh cần tìm:");
                    int id = sc.nextInt();
                    System.out.println(listStudent.getNameStudent(id));
                }
                case 2 -> {
                    System.out.println("Nhập id cần sửa: ");
                    int idS = sc.nextInt();
                    listStudent.update(createStudent(), idS);
                    listStudent.print();
                }
                case 3 -> {
                    System.out.println("Nhập id cần xóa: ");
                    int idX = sc.nextInt();
                    listStudent.deleteById(idX);
                    listStudent.print();
                }
                case 4 -> {
                    double max = listStudent.findScoreMax();
                    System.out.println(max);
                }
                case 5 -> {
                    listStudent.sortAvgScore();
                    listStudent.print();
                }
                case 6 -> {
                    listStudent.add(createStudent());
                }
                case 7 -> {
                    listStudent.findStudentByMax(listStudent.findScoreMax());
                }
                case 0 -> System.exit(0);
                default -> System.out.println("No choice!");
            }
        }
    }

    public static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age1 = sc.nextInt();
        System.out.println("Nhập điểm toán: ");
        double math = sc.nextDouble();
        System.out.println("Nhập điểm hóa ");
        double physic = sc.nextDouble();
        System.out.println("Nhập điểm lý: ");
        double chemistry = sc.nextDouble();
        return new Student(name, age1, math, physic, chemistry);
    }
}
