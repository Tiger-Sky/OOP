package bai7;

public class Nguoi {
    protected int LuongCung;
    protected int LuongThuong;
    protected int TienPhat;
    protected int LuongThucLinh;
    protected String HoTen;
    protected int Tuoi;
    protected String QueQuan;
    protected int MaSo;
    public Nguoi(int LuongCung, int LuongThuong, int TienPhat, String HoTen, int Tuoi, String QueQuan, int MaSo)
    {
        this.LuongCung = LuongCung;
        this.LuongThuong = LuongThuong;
        this.TienPhat = TienPhat;
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.QueQuan = QueQuan;
        this.MaSo = MaSo;
    }
    public int getLuongCung() {
        return LuongCung;
    }
    public void setLuongCung(int luongCung) {
        LuongCung = luongCung;
    }
    public int getLuongThuong() {
        return LuongThuong;
    }
    public void setLuongThuong(int luongThuong) {
        LuongThuong = luongThuong;
    }
    public int getTienPhat() {
        return TienPhat;
    }
    public void setTienPhat(int tienPhat) {
        TienPhat = tienPhat;
    }
    public int getLuongThucLinh() {
        return LuongThucLinh;
    }
    public void setLuongThucLinh(int luongThucLinh) {
        LuongThucLinh = luongThucLinh;
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
    public String getQueQuan() {
        return QueQuan;
    }
    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }
    public int getMaSo() {
        return MaSo;
    }
    public void setMaSo(int maSo) {
        MaSo = maSo;
    }
    
}
