package bai3;

public class KhoiB extends thisinh {
    public static final String T = "Toan";
    public static final String S = "Sinh";
    public static final String H = "Hoa";
    public KhoiB(int SBD, String HoTen, String DiaChi, int MUT)
    {
        super(SBD, HoTen, DiaChi, MUT);
    }
    public String toString()
    {
        return "So bao dao: " + SBD + ", Ho Va Ten: " + HoTen + ", Dia Chi= " + DiaChi + ", Muc uu tien: " + MUT + ", Cac mon thi: " + T + " "+ S+" "+ H;
    }
}
