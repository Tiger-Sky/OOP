package bai1;
public class Congnhan extends canbo {
    protected int bac;
    // tao constructer cong nhan
    public Congnhan(String name, int age, String sex, String address, int bac) {
        super(name, age, sex, address);
        this.bac = bac;
    }
    // day la getter
    public int getBac() {
        return bac;
    }
    //day la setter
    public void setBac(int bac) {
        this.bac = bac;
    }
    // dua cac gia tri de xuat ra
    @Override
    public String toString() {
        return "Cong Nhan["+
        " bac:  " + bac + 
        ", name: '" + HoTen + '\'' +
        ", age: " + Tuoi +
        ", gender: '" + GT + '\'' +
        ", address: '" + diachi + '\'' +
        ']';
    }
}
