package ktragiuamodule2;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class ManagerStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student.");
        System.out.println("4. Sourt student by gpa.");
        System.out.println("5. Show student");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        int size;
        System.out.println("Nhap size:");
        size = scanner.nextInt();
        Student student = new Student();
        Quanlysinhvien quanly = new Quanlysinhvien();
        do{
        switch (choice) {
            case 1:
                quanly.AddStudent(student, size);
            case 5:
                quanly.ShowStudent(size);
                break;
            case 2:
                System.out.println("Nhap id sinh vien muon xoa");
                String id1 = scanner.nextLine();
                quanly.DeleteStudent(id1, size);
                break;
        }
        }while (choice <= 0);
    }
}

class Quanlysinhvien {
    Scanner input = new Scanner(System.in);
    String[][] array = new String[10][5];

    public void AddStudent(Student student, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu" + (i + 1) + "\n");
            System.out.println("Nhập id: ");
            String id = input.nextLine();
            array[i][0] = id;
            System.out.println("Nhập name: ");
            String name = input.nextLine();
            array[i][1] = name;
            System.out.println("Nhập age: ");
            String age = input.nextLine();
            array[i][2] = age;
            System.out.println("Nhập address: ");
            String address = input.nextLine();
            array[i][3] = address;
            System.out.println("Nhập gpa: ");
            String gpa = input.nextLine();
            array[i][4] = gpa;
        }

    }

    public void DeleteStudent(String id1, int size) {
        int index = 0;
        int i, j;
        for (i = 0; i < size; i++) {
            if (array[i][0] == id1) {
                index = i;
            }
        }
        for (i = index; i < size - 1; i++) {
            for (j = i + 1; i < size; i++) {
                array[i][i] = array[j][j];
            }
        }

    }

    public void ShowStudent(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.println("\t" + array[i][j] + "\t");
            }
        }
    }

}

class Student {
    private String id;
    private String name;
    private String age;
    private String address;
    private String gpa;

    public Student() {
    }

    public Student(String id, String name, String age, String address, String gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public String getGpa() {
        return this.gpa;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
}
