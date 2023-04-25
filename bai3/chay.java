package bai3;
import java.util.ArrayList;
import java.util.Scanner;
public class chay {

        public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ THÍ SINH ĐĂNG KÝ THI ĐẠI HỌC =====");
        System.out.println("1. Thêm mới thí sinh.");
        System.out.println("2. Hiển thị thông tin thí sinh và khối thi của thí sinh.");
        System.out.println("3. Tìm kiếm thí sinh theo số báo danh.");
        System.out.println("4. Thoát chương trình.");
        System.out.print("Mời bạn chọn chức năng: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume the newline character
        switch (choice) {
        case 1:
        ts.themThiSinh();
        break;
        case 2:
        ts.hienThiThiSinh();
        break;
        case 3:
        ts.timKiemTheoSoBaoDanh();
        break;
        case 4:
        System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        System.exit(0);
        default:
        System.out.println("Chức năng không hợp lệ! Vui lòng chọn lại.");
        break;
        }
        }
        }
        }