package bai7;

import java.util.*;
public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CBGV cbgv = new CBGV();
        while (true)
        {

            System.out.println("chon 1-4");
            System.out.println("chon 1: them giao vien");
            System.out.println("chon 2: Xoa giao vien theo ma so");
            System.out.println("chon 3: tinh luong");
            System.out.println("chon 4: de thoat");
            int i = scanner.nextInt();
            switch(i)
            {
                case (1): 
                {
                    System.out.println("Nhap ten");
                    String HoTen = scanner.nextLine();
                    System.out.println("Nhap tuoi");
                    int Tuoi = scanner.nextInt();
                    System.out.println("Nhap que quan");
                    String QueQuan = scanner.nextLine();
                    System.out.println("nhap ma so");
                    int maso = scanner.nextInt();
                    System.out.println("Nhap luong thuong");
                    int luongThuong = scanner.nextInt();
                    System.out.println("Nhap luong cung");
                    int luongCung = scanner.nextInt();
                    System.out.println("Nhap tien phat");
                    int luongphat = scanner.nextInt();
                    Nguoi gv = new Nguoi(luongCung,luongThuong,luongphat,HoTen, Tuoi, QueQuan, maso);
                    cbgv.addNguoi(gv);
                    break;
                }
                case (2):
                {
                    int maso = scanner.nextInt();
                    cbgv.deleteById(i);
                    break;
                }
                case (3):
                {
                    int maso = scanner.nextInt();
                    cbgv.getLuong(maso);
                    break;
                }
                case (4):
                {

                    return;
                }
                default:
                {
                    System.out.println("nhap sai moi nhap lai!");
                    break;
                }
            }
        }
    }

}
