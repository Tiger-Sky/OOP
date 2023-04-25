package bai1;
import java.util.*;
public class App{

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            QLCB managerOfficer = new QLCB();
            while (true) {
                System.out.println("Quản lý cán bộ: ");
                System.out.println("Nhập 1: Thêm mới cán bộ: ");
                System.out.println("Nhập 2: Tìm kiếm theo họ tên.: ");
                System.out.println("Nhập 3: Hiện thị thông tin về danh sách các cán bộ");
                System.out.println("Nhập 4: Thoát khỏi chương trình:");
                String line = scanner.nextLine();
                switch (line) {
                    case "1": {
                        System.out.println("Nhập a: Thêm kỹ sư");
                        System.out.println("Nhập b: Thêm công nhân");
                        System.out.println("Nhập c: Thêm nhân viên");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                System.out.print("Nhập tên: ");
                                String name = scanner.nextLine();
                                System.out.print("Nhập tuổi:");
                                int age = scanner.nextInt();
                                System.out.print("Nhập giới tính: ");
                                scanner.nextLine();
                                String gender = scanner.nextLine();
                                System.out.print("Nhập Địa chỉ: ");
                                String address = scanner.nextLine();
                                System.out.print("Nhập Nghành: ");
                                String branch = scanner.nextLine();
                                canbo engineer = new KySu(name, age, gender, address, branch);
                                managerOfficer.themcanbo(engineer);
                                System.out.println(engineer.toString());
                                break;

                            }
                            case "b": {
                                System.out.print("Nhập tên: ");
                                String name = scanner.nextLine();
                                System.out.print("Nhập tuổi:");
                                int age = scanner.nextInt();
                                System.out.print("Nhập giới tính: ");
                                scanner.nextLine();
                                String gender = scanner.nextLine();
                                System.out.print("Nhập Địa chỉ: ");
                                String address = scanner.nextLine();
                                System.out.print("Nhập Bậc: ");
                                int level = scanner.nextInt();
                                canbo worker = new Congnhan(name, age, gender, address, level);
                                managerOfficer.themcanbo(worker);
                                System.out.println(worker.toString());
                                scanner.nextLine();
                                break;
                            }
                            case "c": {
                                System.out.print("Nhập tên: ");
                                String name = scanner.nextLine();
                                System.out.print("Nhập tuổi: ");
                                int age = scanner.nextInt();
                                System.out.print("Nhập giới tính: ");
                                scanner.nextLine();
                                String gender = scanner.nextLine();
                                System.out.print("Nhập Địa chỉ: ");
                                String address = scanner.nextLine();
                                System.out.print("Nhập công việc: ");
                                String task = scanner.nextLine();
                                canbo staff = new NhanVien(name, age, gender, address, task);
                                managerOfficer.themcanbo(staff);
                                System.out.println(staff.toString());
                                break;
                            }
                            default:
                                System.out.println("Không hợp lệ");
                                break;
                        }
                        break;
                    }
                    case "2": {
                        System.out.print("Nhập tên để tìm kiếm: ");
                        String name = scanner.nextLine();
                        managerOfficer.timcacbo(name).forEach(officer -> {
                            System.out.println(officer.toString());
                        });
                        break;
                    }
                    case "3": {
                        managerOfficer.hienthi();
                        break;
                    }
                    case "4": {
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
