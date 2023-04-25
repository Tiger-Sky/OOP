package bai4;

import java.util.ArrayList;

public class KhachSan {
    private ArrayList<Nguoi> danhSachKhachHang;
    private ArrayList<String> danhSachSoCmnd;

    public KhachSan() {
        danhSachKhachHang = new ArrayList<>();
        danhSachSoCmnd = new ArrayList<>();
    }

    public void themKhachHang(Nguoi nguoi) {
        if (!danhSachSoCmnd.contains(nguoi.getCmnd())) {
            danhSachKhachHang.add(nguoi);
            danhSachSoCmnd.add(nguoi.getCmnd());
            System.out.println("Them khach hang thanh cong");
        } else {
            System.out.println("Khach hang da ton tai");
        }
    }

    public void xoaKhachHang(String cmnd) {
        int index = danhSachSoCmnd.indexOf(cmnd);
        if (index >= 0) {
            danhSachKhachHang.remove(index);
            danhSachSoCmnd.remove(index);
            System.out.println("Xoa khach hang thanh cong");
        } else {
            System.out.println("Khach hang khong ton tai");
        }
    }

    public void tinhTienThuePhong(String cmnd, int soNgayThue, char loaiPhong) {
        int index = danhSachSoCmnd.indexOf(cmnd);
        if (index >= 0) {
            int giaPhong;
            if (loaiPhong == 'A') {
                giaPhong = 500;
            } else if (loaiPhong == 'B') {
                giaPhong = 300;
            } else {
                giaPhong = 100;
            }
            int thanhTien = soNgayThue * giaPhong;
            System.out.println("Thong tin khach hang: " + danhSachKhachHang.get(index));
            System.out.println("Tien thue phong: " + thanhTien);
        } else {
            System.out.println("Khach hang khong ton tai");
        }
    }
}
