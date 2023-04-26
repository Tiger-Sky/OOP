package bai1;

public class CongNhan extends canbo{
    public String Bac;

    public CongNhan(String HoTen,int Tuoi,String GT,String DiaChi,String Bac)
    {
        super(HoTen,Tuoi,GT,DiaChi);
        this.Bac = Bac;
    }
    
    public String getBac() {
        return Bac;
    }

    public void setBac(String bac) {
        Bac = bac;
    }

    @Override
    public String toString()
    {
        return "Nhan Vien: " + HoTen + ", Tuoi: " + Tuoi + ", Gioi Tinh: " + GT + ", Dia Chi: " +DiaChi+ ", Bac: " + Bac;
    }
    

    
}
