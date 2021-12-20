package baitap;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalManager animalManager = new AnimalManager();
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Thêm 1 con vật vào danh sách");
            System.out.println("2. Xóa 1 con vật theo tên trong danh sách ");
            System.out.println("3. Sửa con vật theo tên");
            System.out.println("4. Hiển thị thông tin 1 con vật theo tên nhập vào ");
            System.out.println("5. Hiển thị tất cả con vật trong danh sách");
            System.out.println("6. Trả về tất cả các con Dog trong danh sách");
            System.out.println("7. Trả về tất cả các con vật trong khoảng cân nặng đc nhập vào");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    animalManager.addAnimalList();
                    break;
                case 2:
                    animalManager.deleteAnimalByName();
                    break;
                case 3:
                    animalManager.editAnimalByName();
                    break;
                case 4:
                    animalManager.displayAnimalByName();
                    break;
                case 5:
                    animalManager.displayAllAnimalList();
                    break;
                case 6:
                    animalManager.returnAllDogList();
                    break;
                case 7:
                    animalManager.returnAllAnimalList();
                    break;
            }
        } while (choice != 0);
    }
}
