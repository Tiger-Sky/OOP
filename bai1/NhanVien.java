package bai1;
public class NhanVien extends canbo {
    String CongViec;
    public NhanVien(String name, int age, String sex, String address,String job)
    {
        super(name, age, sex, address);
        this.CongViec = job;
        
    }
    
    @Override
    public String toString() {
        return "Ky Su["+
        " Cong Viec:  " + CongViec + 
        ", name: '" + HoTen + '\'' +
        ", age: " + Tuoi +
        ", gender: '" + GT + '\'' +
        ", address: '" + diachi + '\'' +
        ']';
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }
}
