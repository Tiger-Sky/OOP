package bai3;

public class KhoiA extends thisinh{
    public static final String T = "Toan";
    public static final String L = "Ly";
    public static final String H = "Hoa";
    public KhoiA(int SBD, String HoTen, String DiaChi, int MUT)
    {
        super(SBD, HoTen, DiaChi, MUT);
    }
    public String toString()
    {
        return "So bao dao: " + SBD + ", Ho Va Ten: " + HoTen + ", Dia Chi= " + DiaChi + ", Muc uu tien: " + MUT + ", Cac mon thi: " + T + " "+ L+" "+ H;
    }

}
