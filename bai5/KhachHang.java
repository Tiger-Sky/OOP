package bai5;

public class KhachHang {
    private String name;
    private int age;
    private String passport;
    private Phong room;
    private int numberRent;

    public KhachHang(String name, int age, String passport, Phong room, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.numberRent = numberRent;
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Phong getRoom() {
        return room;
    }

    public void setRoom(Phong room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Khách Hàng: " +
                "Tên: '" + name + '\'' +
                ", Tuổi: " + age +
                ", Số chứng minh'" + passport + '\'' + room.toString() ;
    }
}