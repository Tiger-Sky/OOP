package bai8;

import java.util.*;
public class run {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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
                        scanner.nextLine(); 
                        System.out.println("Nhap ten");
                        String HoTen = scanner.nextLine();
                        System.out.println("Nhap tuoi");
                        int Tuoi = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Nhap Truong");
                        String Truong = scanner.nextLine();
                        hocsinh hs = new hocsinh(HoTen, Tuoi, Truong);
                        System.out.println("Nhap id");
                        String id = scanner.nextLine();
                        System.out.println("ngay muon");
                        int nm = scanner.nextInt();
                        System.out.println("Nhap ngay tra");
                        int nt = scanner.nextInt();
                        System.out.println("Nhap ma so sach");
                        int bid = scanner.nextInt();
                        the t = new the(hs,id,nm,nt,bid);
                        qlt.addthe(t);
                        break;
                    }
                    case (2):
                    {
                        scanner.nextLine();
                        String maso = scanner.nextLine( );
                        qlt.delete(maso);
                        break;
                    }
                    case (3):
                    {
                        qlt.hienthi();
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

}
