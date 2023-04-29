package baithicuoiki;

public class HinhVuong extends HinhChuNhat{
    private float side;
    public HinhVuong(float side)
    {
        super(side,side);
    }
    public double tinhDT()
    {
        return this.side * this.side;
    }
}
