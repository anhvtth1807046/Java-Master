package entity;

import controller.MyController;

import java.util.Scanner;

public class EmployeeMenu implements Menu {
    @Override
    public void generateMenu(MyController controller) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Nhập thông tin nhân viên.");
            System.out.println("2. In danh sách nhân viên.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("---------------------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên.");
                    controller.create();
                    break;
                case 2:
                    System.out.println("In danh sách sinh viên.");
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
