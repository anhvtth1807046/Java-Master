package controller;

import entity.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController implements MyController {

    private ArrayList<Employee> list = new ArrayList<>();

    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        Employee employee = new Employee();
        employee.setName(name);
        list.add(employee);
    }

    @Override
    public void readList() {
        System.out.printf("%15s\n", "Tên nhân viên");
        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            System.out.printf("%15s\n", employee.getName());
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
