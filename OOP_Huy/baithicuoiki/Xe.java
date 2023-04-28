package baithicuoiki;

public class Xe {
    private String ten;
    private String loaidongco;
    private int sochongoi;
    public Xe(String ten,String loaidongco, int sochongoi)
    {
        this.ten = ten;
        this.loaidongco = loaidongco;
        this.sochongoi = sochongoi;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getLoaidongco() {
        return loaidongco;
    }
    public void setLoaidongco(String loaidongco) {
        this.loaidongco = loaidongco;
    }
    public int getSochongoi() {
        return sochongoi;
    }
    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }
    public void displayInfo()
    {
        System.out.println("Ten: " + ten);
        System.out.println("Loai Dong Co: " + loaidongco);
        System.out.println("So Cho Ngoi: " + sochongoi);
    }
}
