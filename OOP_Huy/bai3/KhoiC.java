package bai3;

public class KhoiC extends thisinh {
    public static final String V = "Van";
    public static final String S = "Su";
    public static final String D = "Dia";
    public KhoiC(int SBD, String HoTen, String DiaChi, int MUT)
    {
        super(SBD, HoTen, DiaChi, MUT);
    }
    public String toString()
    {
        return "So bao dao: " + SBD + ", Ho Va Ten: " + HoTen + ", Dia Chi= " + DiaChi + ", Muc uu tien: " + MUT + ", Cac mon thi: " + D + " "+ S+" "+ V;
    }
}
