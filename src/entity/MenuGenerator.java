package entity;

import java.util.Scanner;

public class MenuGenerator {

    public void generateEmployeeMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Nhập thông tin sinh viên.");
            System.out.println("2. In danh sách sinh viên.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("---------------------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên.");
                    break;
                case 2:
                    System.out.println("In danh sách sinh viên.");
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;
            }
            if (choice == 3) {
                System.out.println("Hẹn gặp lại.");
                break;
            }
        }
    }

    public void generateStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Tra cứu điểm.");
            System.out.println("2. Xem thông tin lớp.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("---------------------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tìm kiếm điểm môn học.");
                    break;
                case 2:
                    System.out.println("Xem thời khoá biểu.");
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;
            }
        }
    }
    public void generateTeacherMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Xem lịch dạy.");
            System.out.println("2. Điểm danh sinh viên.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("---------------------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Xem lịch dạy.");
                    break;
                case 2:
                    System.out.println("Điểm danh sinh viên.");
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;
            }
        }
    }



}