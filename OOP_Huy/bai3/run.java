package bai3;

import java.util.Scanner;

public class run {
    public static void main(String []args)
    {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("nhap 1 de them moi thi sinh");
            System.out.println("nhap 2 de hien thi thi sinh");
            System.out.println("nhap 3 de tim kiem thi sinh");
            System.out.println("nhap 4 de thoat");
            int ftScr = sc.nextInt();
            switch(ftScr)
            {
                case 1:
                {
                    System.out.println("nhap A de them moi thi sinh khoi A");
                    System.out.println("nhap B de them moi thi sinh khoi B");
                    System.out.println("nhap b de them moi thi sinh khoi C");
                    String KT = sc.nextLine();
                    switch (KT)
                    {
                        case "a":
                        {
                            System.out.println("Nhap ten thi sinh: ");
                            String ten = sc.nextLine();
                            System.out.println("Nhap ten thi sinh: ");
                            String DiaChi = sc.nextLine();
                            System.out.println("Nhap ten thi sinh: ");
                            int MUT = sc.nextInt();
                            System.out.println("Nhap ten thi sinh: ");
                            int SBD = sc.nextInt();
                            thisinh thsinh = new KhoiA(SBD, ten, DiaChi, MUT);
                            ts.themthisinh(thsinh);
                            break;
                        }
                        case "b":
                        {
                            System.out.println("Nhap ten thi sinh: ");
                            String ten = sc.nextLine();
                            System.out.println("Nhap ten thi sinh: ");
                            String DiaChi = sc.nextLine();
                            System.out.println("Nhap ten thi sinh: ");
                            int MUT = sc.nextInt();
                            System.out.println("Nhap ten thi sinh: ");
                            int SBD = sc.nextInt();
                            thisinh thsinh = new KhoiB(SBD, ten, DiaChi, MUT);
                            ts.themthisinh(thsinh);
                            break;
                        }
                        case "c":
                        {
                            System.out.println("Nhap ten thi sinh: ");
                            String ten = sc.nextLine();
                            System.out.println("Nhap ten thi sinh: ");
                            String DiaChi = sc.nextLine();
                            System.out.println("Nhap ten thi sinh: ");
                            int MUT = sc.nextInt();
                            System.out.println("Nhap ten thi sinh: ");
                            int SBD = sc.nextInt();
                            thisinh thsinh = new KhoiC(SBD, ten, DiaChi, MUT);
                            ts.themthisinh(thsinh);
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    ts.hienthi();
                    break;
                }
                case 3:
                {
                    int SBD = sc.nextInt();
                    ts.timkiem(SBD);
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
