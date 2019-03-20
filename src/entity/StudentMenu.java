package entity;

import controller.MyController;

import java.util.Scanner;

public class StudentMenu implements Menu {
    @Override
    public void generateMenu(MyController controller) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Thêm mới sinh viên.");
            System.out.println("2. Hiển thị danh sách sinh viên.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("---------------------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm mới sinh viên.");
                    controller.create();
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách sinh viên.");
                    controller.readList();
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
}
