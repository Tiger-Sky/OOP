package bai4;
import java.util.Scanner;
public class chay {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachSan = new KhachSan();

        System.out.print("Nhập số lượng khách hàng: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập số nguyên

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin khách hàng thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Tuổi: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập số nguyên

            System.out.print("Số chứng minh nhân dân: ");
            String soCMND = scanner.nextLine();

            Nguoi nguoi = new Nguoi(hoTen, tuoi, soCMND);
            khachSan.themKhachHang(nguoi);

            System.out.println();
        }
    }
}