package bai3;
import java.util.ArrayList;
import java.util.Scanner;
class TuyenSinh {
    private ArrayList<ThiSinh> dsThiSinh;

    public TuyenSinh() {
        dsThiSinh = new ArrayList<>();
    }

    public void themThiSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số báo danh: ");
        String soBaoDanh = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập mức ưu tiên: ");
        int mucUuTien = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.print("Nhập khối thi (A/B/C): ");
        String khoiThi = sc.nextLine().toUpperCase();
        switch (khoiThi) {
            case "A":
            case "B":
            case "C":
                ThiSinh ts = new ThiSinh(soBaoDanh, hoTen, diaChi, mucUuTien, khoiThi);
                dsThiSinh.add(ts);
                System.out.println("Thêm mới thí sinh thành công!");
                break;
                default:
                    System.out.println("Khối thi không hợp lệ!");
                    break;
            }
        }
        
        public void hienThiThiSinh() {
            if (dsThiSinh.isEmpty()) {
                System.out.println("Danh sách thí sinh trống!");
                return;
            }
            for (ThiSinh ts : dsThiSinh) {
                System.out.println(ts.toString());
            }
        }
        
        public void timKiemTheoSoBaoDanh() {
            if (dsThiSinh.isEmpty()) {
                System.out.println("Danh sách thí sinh trống!");
                return;
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số báo danh cần tìm: ");
            String soBaoDanh = sc.nextLine();
            for (ThiSinh ts : dsThiSinh) {
                if (ts.getSoBaoDanh().equals(soBaoDanh)) {
                    System.out.println(ts.toString());
                    return;
                }
            }
            System.out.println("Không tìm thấy thí sinh có số báo danh là " + soBaoDanh);
        }
        
        }