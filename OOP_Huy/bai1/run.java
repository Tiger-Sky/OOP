package bai1;

import java.util.Scanner;

public class run {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true)
        {
            System.out.println("nhap 1: De them can bo");
            System.out.println("nhap 2: De tim kiem cac bo");
            System.out.println("nhap 3: De hien thi thong tin");
            System.out.println("nhap 4 : de thoat");
            int mscr = sc.nextInt();
            sc.nextLine();
            switch(mscr)
            {
                case 1:
                {
                    System.out.println("nhap a: Ky Su");
                    System.out.println("nhap b: Cong Nhan");
                    System.out.println("nhap b: Nhan Vien");
                    String scscr = sc.nextLine();
                    switch (scscr)
                    {
                        case "a":
                            {
                                System.out.println("Nhap Ten: ");
                                String ten = sc.nextLine();
                                System.out.println("Nhap Gioi Tinh: ");
                                String GT = sc.nextLine();
                                System.out.println("Nhap Dia Chi: ");
                                String DiaChi = sc.nextLine();
                                System.out.println("Nhap Ngang Dao Tao: ");
                                String Nganh = sc.nextLine();
                                System.out.println("Nhap Tuoi: ");
                                int Tuoi = sc.nextInt();
                                canbo canbo = new KySu(ten,Tuoi,GT,DiaChi,Nganh);
                                qlcb.themcanbo(canbo);
                                break;
                            }
                        case "b":
                            {
                                System.out.println("Nhap Ten: ");
                                String ten = sc.nextLine();
                                System.out.println("Nhap Gioi Tinh: ");
                                String GT = sc.nextLine();
                                System.out.println("Nhap Dia Chi: ");
                                String DiaChi = sc.nextLine();
                                System.out.println("Nhap Bac: ");
                                String Bac = sc.nextLine();
                                System.out.println("Nhap Tuoi: ");
                                int Tuoi = sc.nextInt();
                                canbo canbo = new CongNhan(ten,Tuoi,GT,DiaChi,Bac);
                                qlcb.themcanbo(canbo);
                                break;
                            }
                        case "c":
                            {
                                System.out.println("Nhap Ten: ");
                                String ten = sc.nextLine();
                                System.out.println("Nhap Gioi Tinh: ");
                                String GT = sc.nextLine();
                                System.out.println("Nhap Dia Chi: ");
                                String DiaChi = sc.nextLine();
                                System.out.println("Nhap Cong Viec: ");
                                String CongViec = sc.nextLine();
                                System.out.println("Nhap Tuoi: ");
                                int Tuoi = sc.nextInt();
                                canbo canbo = new NhanVien(ten,Tuoi,GT,DiaChi,CongViec);
                                qlcb.themcanbo(canbo);
                                break;
                            }
                    }
                    break;
                }
                case 2:
                {
                    String HoTen = sc.nextLine();
                    qlcb.timkiem(HoTen).forEach(p -> System.out.println(p.toString()));;
                    break;
                }
                case 3:
                {
                    qlcb.Hienthi();
                    break;
                }
                case 4:
                {
                    return;
                }
            }
        }
    }
}
