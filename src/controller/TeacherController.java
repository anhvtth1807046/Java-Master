package controller;

import entity.Teacher;

import java.util.ArrayList;
import java.util.Scanner;


public class TeacherController implements MyController {

    private ArrayList<Teacher> list = new ArrayList<Teacher>();

    @Override
    public void create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã giáo viên: ");
        String rollNumber = scanner.nextLine();
        System.out.println("Nhập tên giáo viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi giáo viên: ");
        String age = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Teacher teacher = new Teacher(rollNumber, name, age, address);


    }

    @Override
    public void readList() {
        System.out.printf("%15s | %15s | %15s | %15s\n", "Mã giáo viên", "Tên", "Tuổi", "Địa chỉ");
        for (int i = 0; i < list.size(); i++) {
            Teacher teacher = list.get(i);
            System.out.printf("%15s | %15s | %15s | %15s\n",
                    teacher.getRollNumber(), teacher.getName(), teacher.getAge(), teacher.getAddress());

        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
