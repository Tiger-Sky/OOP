package bai5;

import java.util.Scanner;

public class chinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan hotel = new KhachSan();
        while (true) {
            System.out.println("Ứng viên Quản lý ứng dụng");
            System.out.println("Nhập 1: Thêm Khách Hàng");
            System.out.println("Nhập 2: Xóa khách hàng theo số chứng minh");
            System.out.println("Nhập 3: Tính tiền thuê phòng cho khách");
            System.out.println("Nhập 4: Hiển Thị Thông Tin");
            System.out.println("Nhập 5: Rời khỏi:");
            String line = scanner.nextLine();
            switch(line) {
                case "1": {
                    System.out.print("Nhập Tên Khách hàng: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    System.out.print("Nhập số chứng minh: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("Nhập a: Thêm Phòng A ");
                    System.out.println("Nhập b: Thêm Phòng B");
                    System.out.println("Nhập c: Thêm Phòng C");
                    String choise = scanner.nextLine();
                    Phong room;
                    if (choise.equals("a")) {
                        room = new PhongA();
                    } else if (choise.equals("b")) {
                        room = new PhongB();
                    } else if (choise.equals("c")) {
                        room = new PhongC();
                    } else {
                        continue;
                    }
                    System.out.print("Nhập số ngày cho thuê: ");
                    int numberRent = scanner.nextInt();
                    KhachHang person = new KhachHang(name, age, passport, room, numberRent);
                    hotel.add(person);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Nhập số chứng minh: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    break;
                }
                case "3": {
                    System.out.print("Nhập số chứng minh: ");
                    String passport = scanner.nextLine();
                    System.out.println("Giá tiền: " + hotel.calculator(passport));
                    break;
                }
                case "4": {
                    hotel.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }
}