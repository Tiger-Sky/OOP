package bai8;

import java.util.*;


import bai6.HocSinh;
public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLT qlt = new QLT();
        while (true)
        {

            System.out.println("chon 1-4");
            System.out.println("chon 1: them the");
            System.out.println("chon 2: Xoa the");
            System.out.println("chon 3: Hien thi");
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
                    System.out.println("Nhap Truong");
                    String Truong = scanner.nextLine();
                    hocsinh hs = new hocsinh(HoTen, Tuoi, Truong);
                    qlt.add(hs);
                    break;
                }
                case (2):
                {
                    String maso = scanner.nextLine();
                    qlt.delete(maso);
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
