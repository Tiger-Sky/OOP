package bai2;

import java.util.*;

public class chay {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            QLS managerDocument = new QLS();
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
                                String id = scanner.nextLine();
                                System.out.print("Nhập nxb:");
                                String nxb = scanner.nextLine();
                                System.out.print("Nhập số bản phát hành: ");
                                int number = scanner.nextInt();
                                System.out.print("Nhập tác giả: ");
                                scanner.nextLine();
                                String author = scanner.nextLine();
                                System.out.print("Nhập số trang: ");
                                int pageNumber = scanner.nextInt();
                                thongtinchung book = new sach(id, nxb, number, author, pageNumber);
                                managerDocument.addDocument(book);
                                System.out.println(book.toString());
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
                                thongtinchung newspaper = new bao(id, nxb, number, dayIssue);
                                managerDocument.addDocument(newspaper);
                                System.out.println(newspaper.toString());
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
                                thongtinchung journal = new tapchi(id, nxb, number, issueNumber, issueMonth);
                                managerDocument.addDocument(journal);
                                System.out.println(journal.toString());
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
                                managerDocument.searchByBook();
                                break;
                            }
                            case "b": {
                                managerDocument.searchByNewspaper();
                                break;
                            }
                            case "c":
                                managerDocument.searchByJournal();
                                break;
                            default:
                                System.out.println("Không hợp lệ");
                                break;
                        }
                        break;
                    }
                    case "3": {
                        managerDocument.showInfor();
                        break;
                    }
                    case "4": {
                        System.out.print("Nhập id loại bỏ: ");
                        String id = scanner.nextLine();
                        System.out.println(managerDocument.deleteDocument(id) ? "Thành công" : "Thất bại");
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