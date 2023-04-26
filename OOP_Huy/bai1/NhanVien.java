package bai1;

public class NhanVien extends canbo {
    public String CongViec;

    public NhanVien(String HoTen,int Tuoi,String GT,String DiaChi,String CongViec)
    {
        super(HoTen, Tuoi, GT, DiaChi);
        this.CongViec = CongViec;
    }
    
    public String getCongViec() {
        return CongViec;
    }



    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    
    @Override
    public String toString()
    {
        return "Nhan Vien: " + HoTen + ", Tuoi: " + Tuoi + ", Gioi Tinh: " + GT + ", Dia Chi: " +DiaChi+ ", Cong Viec: " + CongViec;
    }

}
