package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This is sudo code. To overview how to do it.
// You can finish by fill you code

public class chinh {

    public static void main(String[] args) {
        KhuPho town = new KhuPho();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Nhập Địa chỉ:");
            scanner.nextLine();
            String address = scanner.nextLine();

            List<Nguoi> persons = new ArrayList<>();
            System.out.println("Nhập số người");
            int number = scanner.nextInt();

            for (int j = 0; j < number; j++) {
                System.out.println("Nhập tên:");
                scanner.nextLine();
                String name = scanner.nextLine();

                System.out.println("Nhập tuổi:");
                int age = scanner.nextInt();

                System.out.println("Nhập Nghề Nghiệp:");
                scanner.nextLine();
                String job = scanner.nextLine();

                System.out.println("Nhập số chứng minh:");
                String passport = scanner.nextLine();

                Nguoi person = new Nguoi(name, age, job, passport);
                persons.add(person);
            }
            town.addFamily(new HoGiaDinh(persons,address));
        }

        // Display information of all families in the town
        List<HoGiaDinh> families = town.getFamilies();
        for (HoGiaDinh family : families) {
            System.out.println(family.toString());
        }
    }
}
