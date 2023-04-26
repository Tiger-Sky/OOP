package bai2;

import java.util.*;

public class run {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            QLTL qltl = new QLTL();
            while (true) {
                System.out.println("Quản lý sách");
                System.out.println("Nhập 1: Thêm mới tài liêu: ");
                System.out.println("Nhập 2: Tìm kiếm tài liệu theo loại: ");
                System.out.println("Nhập 3: Hiện thị thông tin về tài liệu: ");
                System.out.println("Nhập 4: Xóa tài liệu theo mã tài liệu: ");
                System.out.println("Nhập 5: Thoát khỏi chương trình:");
                String line = scanner.nextLine();
                switch (line) {
                    case "1": {
                        System.out.println("Nhập a: thêm sách");
                        System.out.println("Nhập b: thêm báo");
                        System.out.println("Nhập c: tạp chí");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                System.out.print("Nhập mã tài liệu: ");
                                String MTL = scanner.nextLine();
                                System.out.print("Nhập nxb:");
                                String nxb = scanner.nextLine();
                                System.out.print("Nhập số bản phát hành: ");
                                int SoBan = scanner.nextInt();
                                System.out.print("Nhập tác giả: ");
                                scanner.nextLine();
                                String TenTG = scanner.nextLine();
                                System.out.print("Nhập số trang: ");
                                int SoTrang = scanner.nextInt();
                                tailieu book = new sach(MTL, nxb, SoBan, TenTG, SoTrang);
                                qltl.themtailieu(book);
                                scanner.nextLine();
                                break;
                            }
                            case "b": {
                                System.out.print("Nhập ID: ");
                                String id = scanner.nextLine();
                                System.out.print("Nhập nxb:");
                                String nxb = scanner.nextLine();
                                System.out.print("Nhập số bản phát hành: ");
                                int number = scanner.nextInt();
                                System.out.print("Nhập ngày xuất bản: ");
                                int dayIssue = scanner.nextInt();
                                tailieu newspaper = new bao(id, nxb, number, dayIssue);
                                qltl.themtailieu(newspaper);
                                scanner.nextLine();
                                break;
                            }
                            case "c": {
                                System.out.print("Nhập ID: ");
                                String id = scanner.nextLine();
                                System.out.print("Nhập nxb:");
                                String nxb = scanner.nextLine();
                                System.out.print("Nhập số bản phát hành: ");
                                int number = scanner.nextInt();
                                System.out.print("Nhập số phát hành : ");
                                int issueNumber = scanner.nextInt();
                                System.out.print("Nhập tháng phát hành: ");
                                int issueMonth = scanner.nextInt();
                                tailieu journal = new tapchi(id, nxb, number, issueNumber, issueMonth);
                                qltl.themtailieu(journal);
                                scanner.nextLine();
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Nhập a tìm kiếm sách");
                        System.out.println("Nhập b tìm kiếm báo");
                        System.out.println("Nhập a tìm kiếm tạp chí");
                        String choise = scanner.nextLine();
                        switch (choise) {
                            case "a": {
                                qltl.timtheosach();
                                break;
                            }
                            case "b": {
                                qltl.timtheobao();
                                break;
                            }
                            case "c":
                                qltl.timtheotapchi();
                                break;
                            default:
                                System.out.println("Không hợp lệ");
                                break;
                        }
                        break;
                    }
                    case "3": {
                        qltl.hienthi();
                        break;
                    }
                    case "4": {
                        System.out.print("Nhập id loại bỏ: ");
                        String id = scanner.nextLine();
                        System.out.println(qltl.xoatailieu(id) ? "Thành công" : "Thất bại");
                    }
                    break;
                    case "5": {
                        return;
                    }
                    default:
                        System.out.println("Không hợp lệ");
                        continue;
                }
            }
        }
    }

}