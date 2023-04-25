package bai6;
public class HocSinh {
    public String HoTen;
    public int Tuoi;
    public String QueQuan;
    public String Lop;
    public HocSinh(String HoTen, int Tuoi,String QueQuan, String Lop)
    {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.QueQuan = QueQuan;
        this.Lop = Lop;
    }
    public String getHoTen() 
    {
        return HoTen;
    }
    public void setHoTen(String HoTen)
    {
        this.HoTen = HoTen;
    }
    public int getTuoi()
    {
        return Tuoi;
    }
    public void setTuoi(int Tuoi)
    {
        this.Tuoi = Tuoi;
    }
    public String getQuenQuan()
    {
        return QueQuan;
    }
    public void setQueQuan(String QueQuan)
    {
        this.QueQuan = QueQuan;
    }
    public String getLop()
    {
        return Lop;
    }
    public void setLop(String Lop)
    {
        this.Lop = Lop;
    }
    @Override
    public String toString() {
        return "Hoc Sinh " + HoTen + " Co tuoi la: " + Tuoi + " Song tai" + QueQuan + "Hoc tai lop: " + Lop;
    }
}
