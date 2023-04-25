package bai5;

import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private List<KhachHang> persons;

    public KhachSan() {
        persons = new ArrayList<>();
    }

    public void add(KhachHang person) {
        this.persons.add(person);
    }

    public boolean delete(String passport) {
        KhachHang person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return false;
        } else {
            this.persons.remove(person);
            return true;
        }
    }

    public int calculator(String passport) {
        KhachHang person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() {
        this.persons.forEach(p -> System.out.println(p.toString()));
    }
}