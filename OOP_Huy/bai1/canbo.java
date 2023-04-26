package bai1;

public class canbo {
    protected String HoTen;
    protected int Tuoi;
    protected String GT;
    protected String DiaChi;
    public canbo(String HoTen,int Tuoi, String GT, String DiaChi)
    {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.GT = GT;
        this.DiaChi = DiaChi;
    }
    public void setDiaChi(String DiaChi)
    {
        this.DiaChi = DiaChi;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }
    public int getTuoi() {
        return Tuoi;
    }
    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    public String getGT() {
        return GT;
    }
    public void setGT(String gT) {
        GT = gT;
    }
    public String getDiaChi() {
        return DiaChi;
    }
    
}
