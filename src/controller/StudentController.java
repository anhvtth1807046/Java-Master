package controller;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController implements MyController {

    private ArrayList<Student> list = new ArrayList<>();
    
    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        String rollNumber = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Student sinhVien1 = new Student(rollNumber, name, age, address);
        list.add(sinhVien1);
    }

    @Override
    public void readList() {
        System.out.printf("%15s | %15s | %15s | %15s\n", "Mã sinh viên", "Tên", "Tuổi", "Địa chỉ");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.printf("%15s | %15s | %15s | %15s\n",
                    student.getRollNumber(), student.getName(), student.getAge(), student.getAddress());
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
