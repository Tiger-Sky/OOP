package baithicuoiki;

public class HinhChuNhat {
    private float l;
    private float w;
    public HinhChuNhat(float l , float w)
    {
        this.l = l;
        this.w = w;
    }
    public float getL() {
        return l;
    }
    public void setL(float l) {
        this.l = l;
    }
    public float getW() {
        return w;
    }
    public void setW(float w) {
        this.w = w;
    }
    public double tinhDienTich(float l, float w)
    {
        return l * w;
    }
}
