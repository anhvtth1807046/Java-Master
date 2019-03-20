package main;

import controller.*;
import entity.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn quản lý sinh viên hay nhân viên:");
        System.out.println("1. Sinh viên.");
        System.out.println("2. Nhân viên.");
        System.out.println("3. Giáo viên.");
        System.out.println("4. Muốn về.");
        System.out.println("Vui lòng nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        MyController controller = null;
        Menu menu = null;
        switch (choice) {
            case 1:
                controller = new StudentController();
                menu = new StudentMenu();
                System.out.println("Quản lý sinh viên");
                break;
            case 2:
                controller = new EmployeeController();
                menu = new EmployeeMenu();
                System.out.println("Quản lý nhân viên");
                break;
            case 3:
                controller = new TeacherController();
                menu = new TeacherMenu();
                System.out.println("Quản lý giáo viên");
                break;
            case 4:
                System.out.println("Hẹn gặp lại tại kỳ thi...lại!");
                System.exit(1);
                break;
            default:
                System.out.println("Lựa chọn sai. Vui lòng nhập số từ 1 đến 3.");
                break;
        }
        menu.generateMenu(controller);
    }
}
