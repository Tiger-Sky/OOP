package bai6;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QLHS qlhs = new QLHS();

        while (true)
        {

            System.out.println("chon 1-4");
            System.out.println("chon 1: them hoc sinh");
            System.out.println("chon 2: kiem tra hoc sinh 20 tuoi");
            System.out.println("chon 3: kiem tra hoc sinh 25 va o da nang");
            System.out.println("chon 4: de thoat");
            int i = scanner.nextInt();
            switch(i)
            {
                case (1): 
                {
                    System.out.println("Nhap ten");
                    String HoTen = scanner.nextLine();
                    System.out.println("Nhap Tuoi");
                    int Tuoi = scanner.nextInt();
                    System.out.println("Nhap Que Quan");
                    String QueQuan = scanner.nextLine();
                    System.out.println("Nhap Lop");
                    String Lop = scanner.nextLine();
                    HocSinh hs = new HocSinh(HoTen, Tuoi, QueQuan, Lop);
                    QLHS.add(hs);
                    break;
                }
                case (2):
                {
                    qlhs.getStudent20YearOld();
                    break;
                }
                case (3):
                {
                    qlhs.countStudent23YearOldInDN();
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